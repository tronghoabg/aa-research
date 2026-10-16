package com.waze.user;

import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class a implements Serializable {
    private static final long serialVersionUID = 1;
    public int mID;
    protected String mImageUrl;
    public String mNickName;
    public String mPhone;

    public a(a aVar) {
        this.mPhone = null;
        String str = aVar.mNickName;
        if (str != null) {
            this.mNickName = new String(str);
        }
        String str2 = aVar.mPhone;
        if (str2 != null) {
            this.mPhone = new String(str2);
        }
        String str3 = aVar.mImageUrl;
        if (str3 != null) {
            this.mImageUrl = new String(str3);
        }
        this.mID = aVar.mID;
    }

    public int getID() {
        return this.mID;
    }

    public String getImage() {
        return this.mImageUrl;
    }

    public String getName() {
        return this.mNickName;
    }

    public String getPhone() {
        return this.mPhone;
    }

    public void setID(int i2) {
        this.mID = i2;
    }

    public void setImage(String str) {
        this.mImageUrl = str;
    }

    public String toString() {
        return getName();
    }

    public a() {
        this.mPhone = null;
    }
}
