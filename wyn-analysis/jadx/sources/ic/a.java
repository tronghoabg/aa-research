package Ic;

import android.hardware.camera2.CaptureRequest;
import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.util.Size;
import zc.AbstractC4660a;

/* loaded from: classes5.dex */
public final class a extends AbstractC4660a {

    /* renamed from: b, reason: collision with root package name */
    public Size f5438b;

    /* renamed from: c, reason: collision with root package name */
    public Size f5439c;

    /* renamed from: d, reason: collision with root package name */
    public CamcorderProfile f5440d;

    /* renamed from: e, reason: collision with root package name */
    public EncoderProfiles f5441e;

    /* renamed from: f, reason: collision with root package name */
    public int f5442f;

    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.media.EncoderProfiles b(int r5, int r6) {
        /*
            if (r5 < 0) goto L76
            java.lang.String r0 = java.lang.Integer.toString(r5)
            int r6 = A.AbstractC0213f.f(r6)
            if (r6 == 0) goto L56
            r1 = 4
            r2 = 1
            if (r6 == r2) goto L4b
            r3 = 2
            r4 = 5
            if (r6 == r3) goto L40
            r3 = 3
            if (r6 == r3) goto L34
            if (r6 == r1) goto L27
            if (r6 == r4) goto L1c
            goto L62
        L1c:
            boolean r6 = android.media.CamcorderProfile.hasProfile(r5, r2)
            if (r6 == 0) goto L27
            android.media.EncoderProfiles r5 = F5.i.f(r0)
            return r5
        L27:
            r6 = 8
            boolean r6 = android.media.CamcorderProfile.hasProfile(r5, r6)
            if (r6 == 0) goto L34
            android.media.EncoderProfiles r5 = F5.i.t(r0)
            return r5
        L34:
            r6 = 6
            boolean r6 = android.media.CamcorderProfile.hasProfile(r5, r6)
            if (r6 == 0) goto L40
            android.media.EncoderProfiles r5 = F5.i.x(r0)
            return r5
        L40:
            boolean r6 = android.media.CamcorderProfile.hasProfile(r5, r4)
            if (r6 == 0) goto L4b
            android.media.EncoderProfiles r5 = F5.i.z(r0)
            return r5
        L4b:
            boolean r6 = android.media.CamcorderProfile.hasProfile(r5, r1)
            if (r6 == 0) goto L56
            android.media.EncoderProfiles r5 = F5.i.A(r0)
            return r5
        L56:
            r6 = 7
            boolean r6 = android.media.CamcorderProfile.hasProfile(r5, r6)
            if (r6 == 0) goto L62
            android.media.EncoderProfiles r5 = F5.i.B(r0)
            return r5
        L62:
            r6 = 0
            boolean r5 = android.media.CamcorderProfile.hasProfile(r5, r6)
            if (r5 == 0) goto L6e
            android.media.EncoderProfiles r5 = F5.i.C(r0)
            return r5
        L6e:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "No capture session available for current capture session."
            r5.<init>(r6)
            throw r5
        L76:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            java.lang.String r6 = "getBestAvailableCamcorderProfileForResolutionPreset can only be used with valid (>=0) camera identifiers."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Ic.a.b(int, int):android.media.EncoderProfiles");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.media.CamcorderProfile c(int r4, int r5) {
        /*
            if (r4 < 0) goto L72
            int r5 = A.AbstractC0213f.f(r5)
            if (r5 == 0) goto L52
            r0 = 4
            r1 = 1
            if (r5 == r1) goto L47
            r2 = 2
            r3 = 5
            if (r5 == r2) goto L3c
            r2 = 3
            if (r5 == r2) goto L30
            if (r5 == r0) goto L23
            if (r5 == r3) goto L18
            goto L5e
        L18:
            boolean r5 = android.media.CamcorderProfile.hasProfile(r4, r1)
            if (r5 == 0) goto L23
            android.media.CamcorderProfile r4 = android.media.CamcorderProfile.get(r4, r1)
            return r4
        L23:
            r5 = 8
            boolean r1 = android.media.CamcorderProfile.hasProfile(r4, r5)
            if (r1 == 0) goto L30
            android.media.CamcorderProfile r4 = android.media.CamcorderProfile.get(r4, r5)
            return r4
        L30:
            r5 = 6
            boolean r1 = android.media.CamcorderProfile.hasProfile(r4, r5)
            if (r1 == 0) goto L3c
            android.media.CamcorderProfile r4 = android.media.CamcorderProfile.get(r4, r5)
            return r4
        L3c:
            boolean r5 = android.media.CamcorderProfile.hasProfile(r4, r3)
            if (r5 == 0) goto L47
            android.media.CamcorderProfile r4 = android.media.CamcorderProfile.get(r4, r3)
            return r4
        L47:
            boolean r5 = android.media.CamcorderProfile.hasProfile(r4, r0)
            if (r5 == 0) goto L52
            android.media.CamcorderProfile r4 = android.media.CamcorderProfile.get(r4, r0)
            return r4
        L52:
            r5 = 7
            boolean r0 = android.media.CamcorderProfile.hasProfile(r4, r5)
            if (r0 == 0) goto L5e
            android.media.CamcorderProfile r4 = android.media.CamcorderProfile.get(r4, r5)
            return r4
        L5e:
            r5 = 0
            boolean r0 = android.media.CamcorderProfile.hasProfile(r4, r5)
            if (r0 == 0) goto L6a
            android.media.CamcorderProfile r4 = android.media.CamcorderProfile.get(r4, r5)
            return r4
        L6a:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "No capture session available for current capture session."
            r4.<init>(r5)
            throw r4
        L72:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.String r5 = "getBestAvailableCamcorderProfileForResolutionPreset can only be used with valid (>=0) camera identifiers."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Ic.a.c(int, int):android.media.CamcorderProfile");
    }

    @Override // zc.AbstractC4660a
    public final void a(CaptureRequest.Builder builder) {
    }
}
