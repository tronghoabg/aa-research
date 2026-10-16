package com.waze.user;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class FriendUserData extends UserData implements Comparable<FriendUserData> {
    private static final long serialVersionUID = 1;
    public String name;
    public String pictureUrl;

    @Override // com.waze.user.a
    public String getImage() {
        return this.pictureUrl;
    }

    @Override // com.waze.user.a
    public String getName() {
        return this.name;
    }

    @Override // com.waze.user.a
    public void setImage(String str) {
        this.pictureUrl = str;
        super.setImage(str);
    }

    @Override // java.lang.Comparable
    public int compareTo(FriendUserData friendUserData) {
        friendUserData.getClass();
        return 0;
    }
}
