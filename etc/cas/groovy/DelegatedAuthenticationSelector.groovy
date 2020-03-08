def run(Object[] args) {
    def passwordlessUser = args[0]
    def clients = (Set) args[1] // Delegated clients
    def httpServletRequest = args[2]
    def logger = args[3]
    
    logger.info("Testing username $passwordlessUser")

    return clients[0]
	// return null to skip delegation
}
