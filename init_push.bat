cd /d "%~dp0"
git init
git add *
git commit -a -m "version initiale"
git remote add gitHubOriginTpSpring https://didier-tp:password!@github.com/didier-tp/m2idef_tpSpring.git
git push -u gitHubOriginTpSpring master
pause

REM open with text editor
REM opne with system editor