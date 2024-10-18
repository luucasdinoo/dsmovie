import {ReactComponent as GithubIcon} from 'assets/img/github.svg'
import './styles.css'

export default function NavBar(){
    return (
        <header>
        <nav className='container'>
          <div className='dsmovie-nav-content'>
            <h1>DSMovie</h1>
            <a href="https://github.com/luucasdinoo">
              <div className='dsmovie-contact-container'>
                <GithubIcon/>
                <p className='dsmovie-contact-link'>/luucasdinoo</p>
              </div>
            </a>
          </div>
        </nav>
      </header>
    );
};