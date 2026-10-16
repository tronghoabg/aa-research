package kd;

import com.vungle.ads.internal.protos.Sdk;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC3340k;
import uc.C4286w;

/* renamed from: kd.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3306b extends C4286w {
    @Override // uc.C4286w
    public Object f(byte b5, ByteBuffer byteBuffer) {
        int i5 = 0;
        if (b5 == -127) {
            Long l10 = (Long) e(byteBuffer);
            if (l10 == null) {
                return null;
            }
            int iLongValue = (int) l10.longValue();
            EnumC3320p.f39683b.getClass();
            EnumC3320p[] enumC3320pArrValues = EnumC3320p.values();
            int length = enumC3320pArrValues.length;
            while (i5 < length) {
                EnumC3320p enumC3320p = enumC3320pArrValues[i5];
                if (enumC3320p.f39689a == iLongValue) {
                    return enumC3320p;
                }
                i5++;
            }
            return null;
        }
        if (b5 == -126) {
            Long l11 = (Long) e(byteBuffer);
            if (l11 == null) {
                return null;
            }
            int iLongValue2 = (int) l11.longValue();
            EnumC3314j.f39664b.getClass();
            EnumC3314j[] enumC3314jArrValues = EnumC3314j.values();
            int length2 = enumC3314jArrValues.length;
            while (i5 < length2) {
                EnumC3314j enumC3314j = enumC3314jArrValues[i5];
                if (enumC3314j.f39672a == iLongValue2) {
                    return enumC3314j;
                }
                i5++;
            }
            return null;
        }
        if (b5 == -125) {
            Long l12 = (Long) e(byteBuffer);
            if (l12 == null) {
                return null;
            }
            int iLongValue3 = (int) l12.longValue();
            EnumC3325v.f39699b.getClass();
            EnumC3325v[] enumC3325vArrValues = EnumC3325v.values();
            int length3 = enumC3325vArrValues.length;
            while (i5 < length3) {
                EnumC3325v enumC3325v = enumC3325vArrValues[i5];
                if (enumC3325v.f39702a == iLongValue3) {
                    return enumC3325v;
                }
                i5++;
            }
            return null;
        }
        if (b5 == -124) {
            Long l13 = (Long) e(byteBuffer);
            if (l13 == null) {
                return null;
            }
            int iLongValue4 = (int) l13.longValue();
            EnumC3301L.f39581b.getClass();
            EnumC3301L[] enumC3301LArrValues = EnumC3301L.values();
            int length4 = enumC3301LArrValues.length;
            while (i5 < length4) {
                EnumC3301L enumC3301L = enumC3301LArrValues[i5];
                if (enumC3301L.f39590a == iLongValue4) {
                    return enumC3301L;
                }
                i5++;
            }
            return null;
        }
        if (b5 != -123) {
            return super.f(b5, byteBuffer);
        }
        Long l14 = (Long) e(byteBuffer);
        if (l14 == null) {
            return null;
        }
        int iLongValue5 = (int) l14.longValue();
        EnumC3324u.f39696b.getClass();
        EnumC3324u[] enumC3324uArrValues = EnumC3324u.values();
        int length5 = enumC3324uArrValues.length;
        while (i5 < length5) {
            EnumC3324u enumC3324u = enumC3324uArrValues[i5];
            if (enumC3324u.f39698a == iLongValue5) {
                return enumC3324u;
            }
            i5++;
        }
        return null;
    }

    @Override // uc.C4286w
    public void k(ByteArrayOutputStream stream, Object obj) {
        AbstractC3340k.e(stream, "stream");
        if (obj instanceof EnumC3320p) {
            stream.write(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR_VALUE);
            k(stream, Integer.valueOf(((EnumC3320p) obj).f39689a));
            return;
        }
        if (obj instanceof EnumC3314j) {
            stream.write(Sdk.SDKError.Reason.MRAID_DOWNLOAD_JS_ERROR_VALUE);
            k(stream, Integer.valueOf(((EnumC3314j) obj).f39672a));
            return;
        }
        if (obj instanceof EnumC3325v) {
            stream.write(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE);
            k(stream, Integer.valueOf(((EnumC3325v) obj).f39702a));
        } else if (obj instanceof EnumC3301L) {
            stream.write(Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE);
            k(stream, Integer.valueOf(((EnumC3301L) obj).f39590a));
        } else if (!(obj instanceof EnumC3324u)) {
            super.k(stream, obj);
        } else {
            stream.write(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE);
            k(stream, Integer.valueOf(((EnumC3324u) obj).f39698a));
        }
    }
}
