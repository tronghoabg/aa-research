package com.applovin.impl;

import E5.InterfaceC0451g;
import E5.InterfaceC0453h;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.Layout;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.dynamiclinks.internal.FirebaseDynamicLinkRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoBidTokenListener;
import com.unity3d.ads.adplayer.FullScreenWebViewDisplay;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.ads.token.INativeTokenGeneratorListener;
import com.unity3d.services.ads.token.InMemoryTokenStorage;
import com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker;
import com.unity3d.services.core.webview.bridge.Invocation;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import g.C2653a;
import g.InterfaceC2654b;
import g6.C2710a;
import g6.C2711b;
import h6.C2783b;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import k8.InterfaceC3199h;
import kotlin.jvm.internal.AbstractC3340k;
import l2.C3383h;
import l8.AbstractC3409K;
import l8.C3407I;
import t.InterfaceC4035a;
import u6.AbstractC4256a;

/* loaded from: classes.dex */
public final /* synthetic */ class Z0 implements InterfaceC4035a, MolocoBidTokenListener, InterfaceC2654b, INativeTokenGeneratorListener, IInvocationCallbackInvoker, L8.e, InterfaceC0451g, f8.z, jg.a, InterfaceC3199h, jg.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20874a;

    public /* synthetic */ Z0(int i5) {
        this.f20874a = i5;
    }

    @Override // jg.a
    public void accept(Object obj) {
        switch (this.f20874a) {
            case 17:
                ((f6.T) obj).f34979b.getClass();
                return;
            default:
                throw new IllegalArgumentException(String.format("Cannot read more than %,d into a byte array", Integer.valueOf(com.google.android.gms.common.api.f.API_PRIORITY_OTHER)));
        }
    }

    @Override // t.InterfaceC4035a
    public Object apply(Object obj) {
        switch (this.f20874a) {
            case 0:
                return y2.f((i5) obj);
            case 1:
                return y2.g((i5) obj);
            case 2:
                return y2.e((i5) obj);
            case 3:
                return y2.d((i5) obj);
            default:
                return AbstractC3409K.n(Integer.valueOf(((C3383h) obj).f39903a));
        }
    }

    @Override // E5.InterfaceC0451g
    public InterfaceC0453h e(Bundle bundle) {
        l8.e0 e0VarS;
        C2710a[] c2710aArr;
        float f10;
        int i5;
        float f11;
        int i10;
        int i11;
        boolean z2 = true;
        switch (this.f20874a) {
            case 18:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
                if (parcelableArrayList == null) {
                    C3407I c3407i = AbstractC3409K.f40056b;
                    e0VarS = l8.e0.f40101e;
                } else {
                    e0VarS = AbstractC4256a.s(E5.T.f3221H, parcelableArrayList);
                }
                return new f6.Z(bundle.getString(Integer.toString(1, 36), ""), (E5.T[]) e0VarS.toArray(new E5.T[0]));
            case 19:
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(Integer.toString(0, 36));
                return parcelableArrayList2 == null ? new f6.a0(new f6.Z[0]) : new f6.a0((f6.Z[]) AbstractC4256a.s(f6.Z.f35016f, parcelableArrayList2).toArray(new f6.Z[0]));
            case 20:
            case 21:
            default:
                CharSequence charSequence = bundle.getCharSequence(Integer.toString(0, 36));
                CharSequence charSequence2 = charSequence != null ? charSequence : null;
                Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(Integer.toString(1, 36));
                Layout.Alignment alignment2 = alignment != null ? alignment : null;
                Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(Integer.toString(2, 36));
                Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
                Bitmap bitmap = (Bitmap) bundle.getParcelable(Integer.toString(3, 36));
                Bitmap bitmap2 = bitmap != null ? bitmap : null;
                if (bundle.containsKey(Integer.toString(4, 36)) && bundle.containsKey(Integer.toString(5, 36))) {
                    float f12 = bundle.getFloat(Integer.toString(4, 36));
                    i5 = bundle.getInt(Integer.toString(5, 36));
                    f10 = f12;
                } else {
                    f10 = -3.4028235E38f;
                    i5 = Integer.MIN_VALUE;
                }
                int i12 = bundle.containsKey(Integer.toString(6, 36)) ? bundle.getInt(Integer.toString(6, 36)) : Integer.MIN_VALUE;
                float f13 = bundle.containsKey(Integer.toString(7, 36)) ? bundle.getFloat(Integer.toString(7, 36)) : -3.4028235E38f;
                int i13 = bundle.containsKey(Integer.toString(8, 36)) ? bundle.getInt(Integer.toString(8, 36)) : Integer.MIN_VALUE;
                if (bundle.containsKey(Integer.toString(10, 36)) && bundle.containsKey(Integer.toString(9, 36))) {
                    f11 = bundle.getFloat(Integer.toString(10, 36));
                    i10 = bundle.getInt(Integer.toString(9, 36));
                } else {
                    f11 = -3.4028235E38f;
                    i10 = Integer.MIN_VALUE;
                }
                float f14 = bundle.containsKey(Integer.toString(11, 36)) ? bundle.getFloat(Integer.toString(11, 36)) : -3.4028235E38f;
                float f15 = bundle.containsKey(Integer.toString(12, 36)) ? bundle.getFloat(Integer.toString(12, 36)) : -3.4028235E38f;
                if (bundle.containsKey(Integer.toString(13, 36))) {
                    i11 = bundle.getInt(Integer.toString(13, 36));
                } else {
                    i11 = -16777216;
                    z2 = false;
                }
                return new C2783b(charSequence2, alignment2, alignment4, bitmap2, f10, i5, i12, f13, i13, i10, f11, f14, f15, !bundle.getBoolean(Integer.toString(14, 36), false) ? false : z2, i11, bundle.containsKey(Integer.toString(15, 36)) ? bundle.getInt(Integer.toString(15, 36)) : Integer.MIN_VALUE, bundle.containsKey(Integer.toString(16, 36)) ? bundle.getFloat(Integer.toString(16, 36)) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            case 22:
                ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(Integer.toString(1, 36));
                if (parcelableArrayList3 == null) {
                    c2710aArr = new C2710a[0];
                } else {
                    C2710a[] c2710aArr2 = new C2710a[parcelableArrayList3.size()];
                    for (int i14 = 0; i14 < parcelableArrayList3.size(); i14++) {
                        c2710aArr2[i14] = (C2710a) C2710a.f35758i.e((Bundle) parcelableArrayList3.get(i14));
                    }
                    c2710aArr = c2710aArr2;
                }
                return new C2711b(c2710aArr, bundle.getLong(Integer.toString(2, 36), 0L), bundle.getLong(Integer.toString(3, 36), -9223372036854775807L), bundle.getInt(Integer.toString(4, 36)));
            case 23:
                long j8 = bundle.getLong(Integer.toString(0, 36));
                int i15 = bundle.getInt(Integer.toString(1, 36), -1);
                int i16 = bundle.getInt(Integer.toString(7, 36), -1);
                ArrayList parcelableArrayList4 = bundle.getParcelableArrayList(Integer.toString(2, 36));
                int[] intArray = bundle.getIntArray(Integer.toString(3, 36));
                long[] longArray = bundle.getLongArray(Integer.toString(4, 36));
                long j10 = bundle.getLong(Integer.toString(5, 36));
                boolean z10 = bundle.getBoolean(Integer.toString(6, 36));
                if (intArray == null) {
                    intArray = new int[0];
                }
                int[] iArr = intArray;
                Uri[] uriArr = new Uri[0];
                if (parcelableArrayList4 != null) {
                    uriArr = (Uri[]) parcelableArrayList4.toArray(uriArr);
                }
                Uri[] uriArr2 = uriArr;
                if (longArray == null) {
                    longArray = new long[0];
                }
                return new C2710a(j8, i15, i16, iArr, uriArr2, longArray, j10, z10);
        }
    }

    @Override // com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker
    public void invokeCallback(Invocation invocation) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        SharedInstances.webViewAppInvocationCallbackInvoker$lambda$0(invocation);
    }

    @Override // L8.e
    public Object o(C6.l lVar) {
        switch (this.f20874a) {
            case 8:
                return TransportRegistrar.lambda$getComponents$0(lVar);
            case 9:
                return TransportRegistrar.lambda$getComponents$1(lVar);
            case 10:
                return TransportRegistrar.lambda$getComponents$2(lVar);
            case 11:
                return FirebaseSessionsRegistrar.getComponents$lambda$0(lVar);
            case 12:
                return FirebaseSessionsRegistrar.getComponents$lambda$1(lVar);
            case 13:
                return FirebaseSessionsRegistrar.getComponents$lambda$2(lVar);
            case 14:
                return FirebaseSessionsRegistrar.getComponents$lambda$3(lVar);
            case 15:
                return FirebaseSessionsRegistrar.getComponents$lambda$4(lVar);
            case 16:
                return FirebaseSessionsRegistrar.getComponents$lambda$5(lVar);
            default:
                return FirebaseDynamicLinkRegistrar.lambda$getComponents$0(lVar);
        }
    }

    @Override // g.InterfaceC2654b
    public void onActivityResult(Object obj) {
        FullScreenWebViewDisplay.startForResult$lambda$7((C2653a) obj);
    }

    @Override // com.moloco.sdk.publisher.MolocoBidTokenListener
    public void onBidTokenResult(String str, MolocoAdError.ErrorType errorType) {
        AbstractC3340k.e(str, "bidToken");
    }

    @Override // com.unity3d.services.ads.token.INativeTokenGeneratorListener
    public void onReady(String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        InMemoryTokenStorage._get_nativeGeneratedToken_$lambda$2(str);
    }
}
