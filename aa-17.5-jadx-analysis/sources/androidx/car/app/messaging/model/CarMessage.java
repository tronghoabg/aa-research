package androidx.car.app.messaging.model;

import android.net.Uri;
import android.os.Bundle;
import androidx.car.app.model.CarText;
import defpackage.duk;
import defpackage.rb;
import defpackage.sp;
import defpackage.ti;
import j$.util.Objects;

@rb
/* loaded from: classes2.dex */
public class CarMessage {
    private final CarText mBody;
    private final boolean mIsRead;
    private final String mMultimediaMimeType;
    private final Uri mMultimediaUri;
    private final long mReceivedTimeEpochMillis;
    private final Bundle mSender;

    public CarMessage(sp spVar) {
        Bundle bundleA;
        duk dukVar = spVar.a;
        if (dukVar == null) {
            bundleA = null;
        } else {
            ConversationItem.validateSender(dukVar);
            bundleA = dukVar.a();
        }
        this.mSender = bundleA;
        this.mBody = spVar.b;
        this.mMultimediaMimeType = spVar.c;
        this.mMultimediaUri = spVar.d;
        this.mReceivedTimeEpochMillis = spVar.e;
        this.mIsRead = spVar.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarMessage)) {
            return false;
        }
        CarMessage carMessage = (CarMessage) obj;
        return ti.b(getSender(), carMessage.getSender()) && Objects.equals(this.mBody, carMessage.mBody) && this.mReceivedTimeEpochMillis == carMessage.mReceivedTimeEpochMillis && this.mIsRead == carMessage.mIsRead;
    }

    public CarText getBody() {
        return this.mBody;
    }

    public String getMultimediaMimeType() {
        return this.mMultimediaMimeType;
    }

    public Uri getMultimediaUri() {
        return this.mMultimediaUri;
    }

    public long getReceivedTimeEpochMillis() {
        return this.mReceivedTimeEpochMillis;
    }

    public duk getSender() {
        Bundle bundle = this.mSender;
        if (bundle == null) {
            return null;
        }
        return duk.b(bundle);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(ti.a(getSender())), this.mBody, Long.valueOf(this.mReceivedTimeEpochMillis), Boolean.valueOf(this.mIsRead));
    }

    public boolean isRead() {
        return this.mIsRead;
    }

    private CarMessage() {
        this.mSender = null;
        this.mBody = null;
        this.mMultimediaMimeType = null;
        this.mMultimediaUri = null;
        this.mReceivedTimeEpochMillis = 0L;
        this.mIsRead = false;
    }
}
