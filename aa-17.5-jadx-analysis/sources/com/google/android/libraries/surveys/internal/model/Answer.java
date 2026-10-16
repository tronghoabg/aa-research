package com.google.android.libraries.surveys.internal.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.abye;
import defpackage.abyr;
import defpackage.srg;

/* loaded from: classes3.dex */
public final class Answer implements Parcelable {
    public static final Parcelable.Creator<Answer> CREATOR = new srg(2);
    public abye a;
    public String b;
    public abyr c;
    public long d;
    public boolean e;
    public String f;
    public int g;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Answer(android.os.Parcel r4) {
        /*
            r3 = this;
            r3.<init>()
            byte[] r0 = r4.createByteArray()
            android.content.Context r1 = defpackage.wia.b
            if (r1 == 0) goto L29
            wox r1 = defpackage.wia.c
            android.content.Context r1 = defpackage.wia.b
            boolean r1 = defpackage.adhw.c(r1)
            boolean r1 = defpackage.wia.b(r1)
            if (r1 == 0) goto L29
            if (r0 == 0) goto L24
            abye r1 = defpackage.abye.a
            abow r0 = defpackage.wid.c(r1, r0)
            abye r0 = (defpackage.abye) r0
            goto L26
        L24:
            abye r0 = defpackage.abye.a
        L26:
            r3.a = r0
            goto L33
        L29:
            abye r1 = defpackage.abye.a
            abow r0 = defpackage.wid.c(r1, r0)
            abye r0 = (defpackage.abye) r0
            r3.a = r0
        L33:
            java.lang.String r0 = r4.readString()
            int r1 = r0.hashCode()
            r2 = 1
            switch(r1) {
                case -1446966090: goto L73;
                case -1226895677: goto L69;
                case -904377066: goto L5f;
                case -801661455: goto L55;
                case -541898004: goto L4b;
                case 127344588: goto L41;
                default: goto L3f;
            }
        L3f:
            goto Lb0
        L41:
            java.lang.String r1 = "SURVEY_SHOWN"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb0
            r0 = 2
            goto L7c
        L4b:
            java.lang.String r1 = "SURVEY_ACCEPTED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb0
            r0 = 3
            goto L7c
        L55:
            java.lang.String r1 = "SURVEY_CLOSED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb0
            r0 = 6
            goto L7c
        L5f:
            java.lang.String r1 = "QUESTION_ANSWERED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb0
            r0 = 5
            goto L7c
        L69:
            java.lang.String r1 = "INVITATION_ANSWERED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb0
            r0 = 4
            goto L7c
        L73:
            java.lang.String r1 = "NOT_SET"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb0
            r0 = r2
        L7c:
            r3.g = r0
            java.lang.String r0 = r4.readString()
            r3.b = r0
            byte[] r0 = r4.createByteArray()
            if (r0 == 0) goto L95
            abyr r1 = defpackage.abyr.a
            abow r0 = defpackage.wid.c(r1, r0)
            abyr r0 = (defpackage.abyr) r0
            r3.c = r0
            goto L99
        L95:
            abyr r0 = defpackage.abyr.a
            r3.c = r0
        L99:
            long r0 = r4.readLong()
            r3.d = r0
            int r0 = r4.readInt()
            if (r0 <= 0) goto La6
            goto La7
        La6:
            r2 = 0
        La7:
            r3.e = r2
            java.lang.String r4 = r4.readString()
            r3.f = r4
            return
        Lb0:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.surveys.internal.model.Answer.<init>(android.os.Parcel):void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeByteArray(this.a.h());
        int i2 = this.g;
        switch (i2) {
            case 1:
                str = "NOT_SET";
                break;
            case 2:
                str = "SURVEY_SHOWN";
                break;
            case 3:
                str = "SURVEY_ACCEPTED";
                break;
            case 4:
                str = "INVITATION_ANSWERED";
                break;
            case 5:
                str = "QUESTION_ANSWERED";
                break;
            case 6:
                str = "SURVEY_CLOSED";
                break;
            default:
                str = "null";
                break;
        }
        if (i2 == 0) {
            throw null;
        }
        parcel.writeString(str);
        parcel.writeString(this.b);
        parcel.writeByteArray(this.c.h());
        parcel.writeLong(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeString(this.f);
    }

    public Answer() {
        this.a = abye.a;
        this.g = 1;
        this.b = "";
        this.c = abyr.a;
        this.d = 0L;
        this.e = false;
        this.f = "";
    }
}
