package com.athleda;

/**
 * Class for users connections
 */
public class Connections extends UserAccount{
    private int connectionId;

    //connectedUsrID = the userid of the connected user the "friend"
    private int connectedUsrID;

    public int getConnectionId() {
        return connectionId;
    }

    public Connections setConnectionId(int connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    public int getConnectedUsrID() {
        return connectedUsrID;
    }

    public Connections setConnectedUsrID(int connectedUsrID) {
        this.connectedUsrID = connectedUsrID;
        return this;
    }
}
