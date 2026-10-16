package androidx.car.app.messaging.model;

import android.net.Uri;
import android.os.Bundle;
import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.CarText;
import androidx.core.app.Person;
import j$.util.Objects;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(7)
/* loaded from: classes2.dex */
public class CarMessage {
    private final CarText mBody;
    private final boolean mIsRead;
    private final String mMultimediaMimeType;
    private final Uri mMultimediaUri;
    private final long mReceivedTimeEpochMillis;
    private final Bundle mSender;

    /* compiled from: WazeSource */
    public final class Builder {
        CarText mBody;
        boolean mIsRead;
        String mMultimediaMimeType;
        Uri mMultimediaUri;
        long mReceivedTimeEpochMillis;
        Person mSender;

        public CarMessage build() {
            String str = this.mMultimediaMimeType;
            if ((str == null) ^ (this.mMultimediaUri == null)) {
                throw new IllegalStateException("Incomplete multimedia data detected in CarMessage. Please be sure to provide both MIME type and URI for multimedia messages.");
            }
            if (this.mBody == null && str == null) {
                throw new IllegalStateException("Message must have content. Please provide body text, multimedia data (URI + MIME type), or both.");
            }
            return new CarMessage(this);
        }

        public Builder setBody(CarText carText) {
            this.mBody = carText;
            return this;
        }

        public Builder setMultimediaMimeType(String str) {
            this.mMultimediaMimeType = str;
            return this;
        }

        public Builder setMultimediaUri(Uri uri) {
            this.mMultimediaUri = uri;
            return this;
        }

        public Builder setRead(boolean z) {
            this.mIsRead = z;
            return this;
        }

        public Builder setReceivedTimeEpochMillis(long j2) {
            this.mReceivedTimeEpochMillis = j2;
            return this;
        }

        public Builder setSender(Person person) {
            this.mSender = person;
            return this;
        }
    }

    CarMessage(Builder builder) {
        Bundle bundle;
        Person person = builder.mSender;
        if (person == null) {
            bundle = null;
        } else {
            ConversationItem.validateSender(person);
            bundle = person.toBundle();
        }
        this.mSender = bundle;
        this.mBody = builder.mBody;
        this.mMultimediaMimeType = builder.mMultimediaMimeType;
        this.mMultimediaUri = builder.mMultimediaUri;
        this.mReceivedTimeEpochMillis = builder.mReceivedTimeEpochMillis;
        this.mIsRead = builder.mIsRead;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarMessage)) {
            return false;
        }
        CarMessage carMessage = (CarMessage) obj;
        return PersonsEqualityHelper.arePersonsEqual(getSender(), carMessage.getSender()) && Objects.equals(this.mBody, carMessage.mBody) && this.mReceivedTimeEpochMillis == carMessage.mReceivedTimeEpochMillis && this.mIsRead == carMessage.mIsRead;
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

    public Person getSender() {
        Bundle bundle = this.mSender;
        if (bundle == null) {
            return null;
        }
        return Person.fromBundle(bundle);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(PersonsEqualityHelper.getPersonHashCode(getSender())), this.mBody, Long.valueOf(this.mReceivedTimeEpochMillis), Boolean.valueOf(this.mIsRead));
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
