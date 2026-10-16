package Z6;

import U8.v0;
import Z6.c;
import a2.t;
import a2.u;
import a6.C1333b;
import a6.C1334c;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import androidx.fragment.app.C1410a0;
import androidx.fragment.app.C1411b;
import androidx.fragment.app.C1413c;
import androidx.fragment.app.g0;
import androidx.fragment.app.j0;
import androidx.recyclerview.widget.C1486y;
import androidx.recyclerview.widget.t0;
import androidx.recyclerview.widget.u0;
import b6.C1516a;
import b6.C1517b;
import b6.d;
import b6.e;
import b6.f;
import b6.j;
import b6.k;
import b6.l;
import b6.m;
import b6.n;
import b7.C1518a;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class c implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17009a;

    public /* synthetic */ c(int i5) {
        this.f17009a = i5;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        Bundle bundle;
        switch (this.f17009a) {
            case 0:
                int iO0 = v0.o0(parcel);
                PendingIntent pendingIntent = null;
                Bundle bundleQ = null;
                byte[] bArrR = null;
                int iF0 = 0;
                int iF02 = 0;
                int iF03 = 0;
                while (parcel.dataPosition() < iO0) {
                    int i5 = parcel.readInt();
                    char c10 = (char) i5;
                    if (c10 == 1) {
                        iF02 = v0.f0(i5, parcel);
                    } else if (c10 == 2) {
                        pendingIntent = (PendingIntent) v0.x(parcel, i5, PendingIntent.CREATOR);
                    } else if (c10 == 3) {
                        iF03 = v0.f0(i5, parcel);
                    } else if (c10 == 4) {
                        bundleQ = v0.q(i5, parcel);
                    } else if (c10 == 5) {
                        bArrR = v0.r(i5, parcel);
                    } else if (c10 != 1000) {
                        v0.m0(i5, parcel);
                    } else {
                        iF0 = v0.f0(i5, parcel);
                    }
                }
                v0.D(iO0, parcel);
                return new b(iF0, iF02, pendingIntent, iF03, bundleQ, bArrR);
            case 1:
                return new u(parcel);
            case 2:
                return new t(parcel);
            case 3:
                return new C1333b(parcel);
            case 4:
                return new C1334c(parcel);
            case 5:
                return new Parcelable(parcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new c(5);

                    /* renamed from: a, reason: collision with root package name */
                    public final int f17656a;

                    /* renamed from: b, reason: collision with root package name */
                    public final MediaDescriptionCompat f17657b;

                    {
                        this.f17656a = parcel.readInt();
                        this.f17657b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.f17656a + ", mDescription=" + this.f17657b + '}';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i10) {
                        parcel2.writeInt(this.f17656a);
                        this.f17657b.writeToParcel(parcel2, i10);
                    }
                };
            case 6:
                Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                if (objCreateFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
                String strG = android.support.v4.media.a.g(mediaDescription);
                CharSequence charSequenceI = android.support.v4.media.a.i(mediaDescription);
                CharSequence charSequenceH = android.support.v4.media.a.h(mediaDescription);
                CharSequence charSequenceC = android.support.v4.media.a.c(mediaDescription);
                Bitmap bitmapE = android.support.v4.media.a.e(mediaDescription);
                Uri uriF = android.support.v4.media.a.f(mediaDescription);
                Bundle bundleD = android.support.v4.media.a.d(mediaDescription);
                if (bundleD != null) {
                    bundleD = android.support.v4.media.session.b.s0(bundleD);
                }
                Uri uriA = bundleD != null ? (Uri) bundleD.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
                if (uriA == null) {
                    bundle = bundleD;
                } else if (bundleD.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && bundleD.size() == 2) {
                    bundle = null;
                } else {
                    bundleD.remove("android.support.v4.media.description.MEDIA_URI");
                    bundleD.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    bundle = bundleD;
                }
                if (uriA == null) {
                    uriA = android.support.v4.media.b.a(mediaDescription);
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(strG, charSequenceI, charSequenceH, charSequenceC, bitmapE, uriF, bundle, uriA);
                mediaDescriptionCompat.f17666i = mediaDescription;
                return mediaDescriptionCompat;
            case 7:
                return new MediaMetadataCompat(parcel);
            case 8:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 9:
                return new C1411b(parcel);
            case 10:
                return new C1413c(parcel);
            case 11:
                C1410a0 c1410a0 = new C1410a0();
                c1410a0.f18368a = parcel.readString();
                c1410a0.f18369b = parcel.readInt();
                return c1410a0;
            case 12:
                g0 g0Var = new g0();
                g0Var.f18445e = null;
                g0Var.f18446f = new ArrayList();
                g0Var.f18447g = new ArrayList();
                g0Var.f18441a = parcel.createStringArrayList();
                g0Var.f18442b = parcel.createStringArrayList();
                g0Var.f18443c = (C1411b[]) parcel.createTypedArray(C1411b.CREATOR);
                g0Var.f18444d = parcel.readInt();
                g0Var.f18445e = parcel.readString();
                g0Var.f18446f = parcel.createStringArrayList();
                g0Var.f18447g = parcel.createTypedArrayList(C1413c.CREATOR);
                g0Var.f18448h = parcel.createTypedArrayList(C1410a0.CREATOR);
                return g0Var;
            case 13:
                return new j0(parcel);
            case 14:
                C1486y c1486y = new C1486y();
                c1486y.f19037a = parcel.readInt();
                c1486y.f19038b = parcel.readInt();
                c1486y.f19039c = parcel.readInt() == 1;
                return c1486y;
            case 15:
                t0 t0Var = new t0();
                t0Var.f18986a = parcel.readInt();
                t0Var.f18987b = parcel.readInt();
                t0Var.f18989d = parcel.readInt() == 1;
                int i10 = parcel.readInt();
                if (i10 > 0) {
                    int[] iArr = new int[i10];
                    t0Var.f18988c = iArr;
                    parcel.readIntArray(iArr);
                }
                return t0Var;
            case 16:
                u0 u0Var = new u0();
                u0Var.f18999a = parcel.readInt();
                u0Var.f19000b = parcel.readInt();
                int i11 = parcel.readInt();
                u0Var.f19001c = i11;
                if (i11 > 0) {
                    int[] iArr2 = new int[i11];
                    u0Var.f19002d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i12 = parcel.readInt();
                u0Var.f19003e = i12;
                if (i12 > 0) {
                    int[] iArr3 = new int[i12];
                    u0Var.f19004f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                u0Var.f19006h = parcel.readInt() == 1;
                u0Var.f19007i = parcel.readInt() == 1;
                u0Var.f19008j = parcel.readInt() == 1;
                u0Var.f19005g = parcel.readArrayList(t0.class.getClassLoader());
                return u0Var;
            case 17:
                return new C1516a(parcel);
            case 18:
                return new C1517b(parcel);
            case 19:
                return new b6.c(parcel);
            case 20:
                return new d(parcel);
            case 21:
                return new e(parcel);
            case 22:
                return new f(parcel);
            case 23:
                return new j(parcel);
            case 24:
                return new k(parcel);
            case 25:
                return new l(parcel);
            case 26:
                return new m(parcel);
            case 27:
                return new n(parcel);
            case 28:
                int iO02 = v0.o0(parcel);
                Bundle bundleQ2 = null;
                int iF04 = 0;
                int iF05 = 0;
                while (parcel.dataPosition() < iO02) {
                    int i13 = parcel.readInt();
                    char c11 = (char) i13;
                    if (c11 == 1) {
                        iF04 = v0.f0(i13, parcel);
                    } else if (c11 == 2) {
                        iF05 = v0.f0(i13, parcel);
                    } else if (c11 != 3) {
                        v0.m0(i13, parcel);
                    } else {
                        bundleQ2 = v0.q(i13, parcel);
                    }
                }
                v0.D(iO02, parcel);
                return new C1518a(iF04, iF05, bundleQ2);
            default:
                int iO03 = v0.o0(parcel);
                String strY = null;
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < iO03) {
                    int i14 = parcel.readInt();
                    char c12 = (char) i14;
                    if (c12 == 2) {
                        strY = v0.y(i14, parcel);
                    } else if (c12 != 5) {
                        v0.m0(i14, parcel);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) v0.x(parcel, i14, GoogleSignInOptions.CREATOR);
                    }
                }
                v0.D(iO03, parcel);
                return new SignInConfiguration(strY, googleSignInOptions);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i5) {
        switch (this.f17009a) {
            case 0:
                return new b[i5];
            case 1:
                return new u[i5];
            case 2:
                return new t[i5];
            case 3:
                return new C1333b[i5];
            case 4:
                return new C1334c[i5];
            case 5:
                return new MediaBrowserCompat$MediaItem[i5];
            case 6:
                return new MediaDescriptionCompat[i5];
            case 7:
                return new MediaMetadataCompat[i5];
            case 8:
                return new RatingCompat[i5];
            case 9:
                return new C1411b[i5];
            case 10:
                return new C1413c[i5];
            case 11:
                return new C1410a0[i5];
            case 12:
                return new g0[i5];
            case 13:
                return new j0[i5];
            case 14:
                return new C1486y[i5];
            case 15:
                return new t0[i5];
            case 16:
                return new u0[i5];
            case 17:
                return new C1516a[i5];
            case 18:
                return new C1517b[i5];
            case 19:
                return new b6.c[i5];
            case 20:
                return new d[i5];
            case 21:
                return new e[i5];
            case 22:
                return new f[i5];
            case 23:
                return new j[i5];
            case 24:
                return new k[i5];
            case 25:
                return new l[i5];
            case 26:
                return new m[i5];
            case 27:
                return new n[i5];
            case 28:
                return new C1518a[i5];
            default:
                return new SignInConfiguration[i5];
        }
    }
}
