package com.waze.messages;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class PushQuestionData implements Parcelable {
    public static final Parcelable.Creator<PushQuestionData> CREATOR = new b(1);
    public String ActionText1;
    public String ActionText2;
    public String MessageID;
    public String NotificationID;
    public String QuestionID;
    public String SubText1;
    public String SubText2;
    public String Text;
    public String defaultAction;

    protected PushQuestionData(Parcel parcel) {
        this.Text = null;
        this.defaultAction = null;
        this.SubText1 = null;
        this.SubText2 = null;
        this.ActionText1 = null;
        this.ActionText2 = null;
        this.QuestionID = null;
        this.NotificationID = null;
        this.MessageID = null;
        this.Text = parcel.readString();
        this.defaultAction = parcel.readString();
        this.SubText1 = parcel.readString();
        this.SubText2 = parcel.readString();
        this.ActionText1 = parcel.readString();
        this.ActionText2 = parcel.readString();
        this.QuestionID = parcel.readString();
        this.NotificationID = parcel.readString();
        this.MessageID = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.Text);
        parcel.writeString(this.defaultAction);
        parcel.writeString(this.SubText1);
        parcel.writeString(this.SubText2);
        parcel.writeString(this.ActionText1);
        parcel.writeString(this.ActionText2);
        parcel.writeString(this.QuestionID);
        parcel.writeString(this.NotificationID);
        parcel.writeString(this.MessageID);
    }

    public PushQuestionData() {
        this.Text = null;
        this.defaultAction = null;
        this.SubText1 = null;
        this.SubText2 = null;
        this.ActionText1 = null;
        this.ActionText2 = null;
        this.QuestionID = null;
        this.NotificationID = null;
        this.MessageID = null;
    }
}
