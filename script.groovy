
def BuildApp(){
  echo 'Building App................................'
}

def TestApp(){
  echo 'Testing App................................'
}

def DeployApp(){
  echo 'Deploying App................................'
  echo "deploying version ${params.VERSION}"
}


return this
