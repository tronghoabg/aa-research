package Cd;

import android.content.Intent;
import android.content.pm.PackageManager;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoSamplesKt;
import com.moloco.sdk.publisher.NativeAd;
import com.moloco.sdk.publisher.RewardedInterstitialAd;
import ef.C2515C;
import ff.AbstractC2641B;
import java.util.ArrayList;
import java.util.List;
import jf.C3102b;
import jf.C3104d;
import jf.C3109i;
import jf.InterfaceC3105e;
import jf.InterfaceC3106f;
import jf.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes5.dex */
public final /* synthetic */ class U implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2037a;

    public /* synthetic */ U(int i5) {
        this.f2037a = i5;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        C3102b c3102b;
        switch (this.f2037a) {
            case 0:
                Fd.c it = (Fd.c) obj2;
                AbstractC3340k.e((f0) obj, "<this>");
                AbstractC3340k.e(it, "it");
                return C2515C.f34653a;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 2:
                return ((InterfaceC3108h) obj).plus((InterfaceC3106f) obj2);
            case 3:
                return ((InterfaceC3108h) obj).plus((InterfaceC3106f) obj2);
            case 4:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 5:
                InterfaceC3106f interfaceC3106f = (InterfaceC3106f) obj2;
                if (!(interfaceC3106f instanceof Jf.u)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? interfaceC3106f : Integer.valueOf(iIntValue + 1);
            case 6:
                Jf.u uVar = (Jf.u) obj;
                InterfaceC3106f interfaceC3106f2 = (InterfaceC3106f) obj2;
                if (uVar != null) {
                    return uVar;
                }
                if (interfaceC3106f2 instanceof Jf.u) {
                    return (Jf.u) interfaceC3106f2;
                }
                return null;
            case 7:
                Jf.x xVar = (Jf.x) obj;
                InterfaceC3106f interfaceC3106f3 = (InterfaceC3106f) obj2;
                if (interfaceC3106f3 instanceof Jf.u) {
                    Jf.u uVar2 = (Jf.u) interfaceC3106f3;
                    Object objB = uVar2.b(xVar.f6145a);
                    int i5 = xVar.f6148d;
                    xVar.f6146b[i5] = objB;
                    xVar.f6148d = i5 + 1;
                    xVar.f6147c[i5] = uVar2;
                }
                return xVar;
            case 8:
                CharSequence s10 = (CharSequence) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                AbstractC3340k.e(s10, "s");
                return Character.valueOf(s10.charAt(iIntValue2));
            case 9:
                Jd.s m10 = (Jd.s) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                AbstractC3340k.e(m10, "m");
                return Character.valueOf(m10.f6070a.charAt(iIntValue3));
            case 10:
                KClass clazz = (KClass) obj;
                final List types = (List) obj2;
                AbstractC3340k.e(clazz, "clazz");
                AbstractC3340k.e(types, "types");
                ArrayList arrayListP0 = com.moloco.sdk.internal.publisher.H.p0(Zf.a.f17089a, types, true);
                AbstractC3340k.b(arrayListP0);
                final int i10 = 0;
                return com.moloco.sdk.internal.publisher.H.g0(clazz, arrayListP0, new tf.a() { // from class: Sf.g
                    @Override // tf.a
                    public final Object invoke() {
                        switch (i10) {
                        }
                        return ((KType) types.get(0)).getClassifier();
                    }
                });
            case 11:
                KClass clazz2 = (KClass) obj;
                final List types2 = (List) obj2;
                AbstractC3340k.e(clazz2, "clazz");
                AbstractC3340k.e(types2, "types");
                ArrayList arrayListP02 = com.moloco.sdk.internal.publisher.H.p0(Zf.a.f17089a, types2, true);
                AbstractC3340k.b(arrayListP02);
                final int i11 = 1;
                KSerializer kSerializerG0 = com.moloco.sdk.internal.publisher.H.g0(clazz2, arrayListP02, new tf.a() { // from class: Sf.g
                    @Override // tf.a
                    public final Object invoke() {
                        switch (i11) {
                        }
                        return ((KType) types2.get(0)).getClassifier();
                    }
                });
                if (kSerializerG0 != null) {
                    return AbstractC2641B.u(kSerializerG0);
                }
                return null;
            case 12:
                return MolocoSamplesKt.MolocoCreateRewardedInterstitialAd$lambda$7((RewardedInterstitialAd) obj, (MolocoAdError.AdCreateError) obj2);
            case 13:
                return MolocoSamplesKt.MolocoCreateNativeAd$lambda$5((NativeAd) obj, (MolocoAdError.AdCreateError) obj2);
            case 14:
                return MolocoSamplesKt.MolocoCreateInterstitialAd$lambda$6((InterstitialAd) obj, (MolocoAdError.AdCreateError) obj2);
            case 15:
                d0 delayMillis = (d0) obj;
                ((Integer) obj2).intValue();
                AbstractC3340k.e(delayMillis, "$this$delayMillis");
                return 100L;
            case 16:
                d0 delayMillis2 = (d0) obj;
                ((Integer) obj2).intValue();
                AbstractC3340k.e(delayMillis2, "$this$delayMillis");
                return 100L;
            case 17:
                PackageManager pm = (PackageManager) obj;
                Intent i12 = (Intent) obj2;
                AbstractC3340k.e(pm, "pm");
                AbstractC3340k.e(i12, "i");
                return Boolean.valueOf(i12.resolveActivity(pm) != null);
            case 18:
                String acc = (String) obj;
                InterfaceC3106f element = (InterfaceC3106f) obj2;
                AbstractC3340k.e(acc, "acc");
                AbstractC3340k.e(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            default:
                InterfaceC3108h acc2 = (InterfaceC3108h) obj;
                InterfaceC3106f element2 = (InterfaceC3106f) obj2;
                AbstractC3340k.e(acc2, "acc");
                AbstractC3340k.e(element2, "element");
                InterfaceC3108h interfaceC3108hMinusKey = acc2.minusKey(element2.getKey());
                C3109i c3109i = C3109i.f38759a;
                if (interfaceC3108hMinusKey == c3109i) {
                    return element2;
                }
                C3104d c3104d = C3104d.f38758a;
                InterfaceC3105e interfaceC3105e = (InterfaceC3105e) interfaceC3108hMinusKey.get(c3104d);
                if (interfaceC3105e == null) {
                    c3102b = new C3102b(element2, interfaceC3108hMinusKey);
                } else {
                    InterfaceC3108h interfaceC3108hMinusKey2 = interfaceC3108hMinusKey.minusKey(c3104d);
                    if (interfaceC3108hMinusKey2 == c3109i) {
                        return new C3102b(interfaceC3105e, element2);
                    }
                    c3102b = new C3102b(interfaceC3105e, new C3102b(element2, interfaceC3108hMinusKey2));
                }
                return c3102b;
        }
    }
}
