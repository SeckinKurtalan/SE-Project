export default function Navbar() {
    return <nav className={"nav"}>
        <a href={"/"} className={"site-title"}>Site Title</a>
        <ul>
            <li>
                <a href={"/pricing"}>Pricing</a>
            </li>
            <li>
                <a href={"/about"}>About</a>
            </li>
        </ul>
    </nav>
}