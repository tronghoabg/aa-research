package androidx.media;

import java.util.Arrays;
import ka.AbstractC3256n;

/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public int f18710a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f18711b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f18712c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f18713d = -1;

    @Override // androidx.media.AudioAttributesImpl
    public final int a() {
        int i5 = this.f18713d;
        return i5 != -1 ? i5 : AudioAttributesCompat.c(this.f18712c, this.f18710a);
    }

    @Override // androidx.media.AudioAttributesImpl
    public final Object b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f18711b == audioAttributesImplBase.f18711b) {
            int i5 = this.f18712c;
            int i10 = audioAttributesImplBase.f18712c;
            int iA = audioAttributesImplBase.a();
            if (iA == 6) {
                i10 |= 4;
            } else if (iA == 7) {
                i10 |= 1;
            }
            if (i5 == (i10 & 273) && this.f18710a == audioAttributesImplBase.f18710a && this.f18713d == audioAttributesImplBase.f18713d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f18711b), Integer.valueOf(this.f18712c), Integer.valueOf(this.f18710a), Integer.valueOf(this.f18713d)});
    }

    public final String toString() {
        String strG;
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f18713d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f18713d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        int i5 = this.f18710a;
        int i10 = AudioAttributesCompat.f18706b;
        switch (i5) {
            case 0:
                strG = "USAGE_UNKNOWN";
                break;
            case 1:
                strG = "USAGE_MEDIA";
                break;
            case 2:
                strG = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strG = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strG = "USAGE_ALARM";
                break;
            case 5:
                strG = "USAGE_NOTIFICATION";
                break;
            case 6:
                strG = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                strG = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                strG = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                strG = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                strG = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                strG = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strG = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                strG = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strG = "USAGE_GAME";
                break;
            case 15:
            default:
                strG = AbstractC3256n.g(i5, "unknown usage ");
                break;
            case 16:
                strG = "USAGE_ASSISTANT";
                break;
        }
        sb2.append(strG);
        sb2.append(" content=");
        sb2.append(this.f18711b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f18712c).toUpperCase());
        return sb2.toString();
    }
}
