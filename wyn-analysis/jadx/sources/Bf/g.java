package Bf;

import E5.Q;
import Jd.H;
import Wf.C1266y;
import android.os.StatFs;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1451o;
import com.moloco.sdk.internal.C1880b;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ViewOnAttachStateChangeListenerC1879a;
import com.moloco.sdk.publisher.MolocoInitStatus;
import com.moloco.sdk.publisher.MolocoInitializationListener;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.I0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.V;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.C2079l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.C2081m;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.E;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.C2083a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.C2092j;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u;
import ef.C2515C;
import ff.AbstractC2641B;
import ff.t;
import ff.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import k1.S;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class g implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1691a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1692b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1693c;

    public /* synthetic */ g(int i5, Object obj, Object obj2) {
        this.f1691a = i5;
        this.f1692b = obj;
        this.f1693c = obj2;
    }

    @Override // tf.a
    public final Object invoke() {
        String[] strArrNames;
        C2515C c2515c = C2515C.f34653a;
        Object obj = this.f1693c;
        Object obj2 = this.f1692b;
        switch (this.f1691a) {
            case 0:
                i iVar = (i) obj2;
                iVar.getClass();
                CharSequence input = (CharSequence) obj;
                AbstractC3340k.e(input, "input");
                Matcher matcher = iVar.f1695a.matcher(input);
                AbstractC3340k.d(matcher, "matcher(...)");
                if (matcher.find(0)) {
                    return new f(matcher, input);
                }
                return null;
            case 1:
                if (!((ArrayList) obj2).isEmpty()) {
                    H h10 = (H) obj;
                    int iV0 = k.v0(h10.f6031f, '/', h10.f6033h.f6020a.length() + 3, 4);
                    if (iV0 != -1) {
                        String str = h10.f6031f;
                        int iX0 = k.x0(str, new char[]{'?', '#'}, iV0, false);
                        if (iX0 == -1) {
                            String strSubstring = str.substring(iV0);
                            AbstractC3340k.d(strSubstring, "substring(...)");
                            return strSubstring;
                        }
                        String strSubstring2 = str.substring(iV0, iX0);
                        AbstractC3340k.d(strSubstring2, "substring(...)");
                        return strSubstring2;
                    }
                }
                return "";
            case 2:
                Sf.a aVar = (Sf.a) obj2;
                C1266y c1266y = (C1266y) aVar.f11116c;
                if (c1266y == null) {
                    Enum[] enumArr = (Enum[]) aVar.f11115b;
                    c1266y = new C1266y((String) obj, enumArr.length);
                    for (Enum r02 : enumArr) {
                        c1266y.j(r02.name(), false);
                    }
                }
                return c1266y;
            case 3:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Xf.c cVar = (Xf.c) obj;
                Xf.h hVar = cVar.f16252a;
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj2;
                Yf.r.n(cVar, serialDescriptor);
                int iD = serialDescriptor.d();
                for (int i5 = 0; i5 < iD; i5++) {
                    List listF = serialDescriptor.f(i5);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : listF) {
                        if (obj3 instanceof Xf.r) {
                            arrayList.add(obj3);
                        }
                    }
                    Xf.r rVar = (Xf.r) ff.o.K0(arrayList);
                    if (rVar != null && (strArrNames = rVar.names()) != null) {
                        for (String str2 : strArrNames) {
                            String str3 = AbstractC3340k.a(serialDescriptor.getKind(), Uf.i.f12830q) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str2)) {
                                String message = "The suggested name '" + str2 + "' for " + str3 + ' ' + serialDescriptor.e(i5) + " is already one of the names for " + str3 + ' ' + serialDescriptor.e(((Number) AbstractC2641B.v(str2, linkedHashMap)).intValue()) + " in " + serialDescriptor;
                                AbstractC3340k.e(message, "message");
                                throw new Sf.i(message);
                            }
                            linkedHashMap.put(str2, Integer.valueOf(i5));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? w.f35433a : linkedHashMap;
            case 4:
                WeakHashMap weakHashMap = S.f38779a;
                FrameLayout frameLayout = (FrameLayout) obj2;
                C1880b c1880b = (C1880b) obj;
                if (frameLayout.isAttachedToWindow()) {
                    C1880b.a(c1880b, frameLayout);
                } else {
                    frameLayout.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1879a(frameLayout, c1880b, frameLayout));
                }
                return c2515c;
            case 5:
                ((MolocoInitializationListener) obj2).onMolocoInitializationStatus((MolocoInitStatus) obj);
                return c2515c;
            case 6:
                ((View) obj2).removeOnAttachStateChangeListener((T) obj);
                return c2515c;
            case 7:
                ((AbstractC1451o) obj2).c((V) obj);
                return c2515c;
            case 8:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.c cVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.c) obj;
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.b((String) obj2, cVar2.f30574a, cVar2.f30576c);
            case 9:
                ((E) obj2).getClass();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                C2079l c2079l = (C2079l) obj;
                if (c2079l != null) {
                    for (List list : c2079l.f31419c) {
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        for (Object obj4 : list) {
                            String str4 = ((C2092j) obj4).f31488d;
                            if (str4 == null || k.y0(str4)) {
                                arrayList9.add(obj4);
                            }
                        }
                        Iterator it = arrayList9.iterator();
                        while (it.hasNext()) {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.m mVar = ((C2092j) it.next()).f31489e;
                            if (mVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l) {
                                u uVar = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l) mVar).f31491a;
                                t.e0(uVar.f31514d, arrayList2);
                                C2083a c2083a = uVar.f31515e;
                                if (c2083a != null) {
                                    t.e0(c2083a.f31468b, arrayList3);
                                    t.e0(c2083a.f31469c, arrayList4);
                                }
                                t.e0(uVar.f31516f, arrayList7);
                            } else {
                                if (!(mVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k)) {
                                    throw new Q((byte) 0, 9);
                                }
                                t.e0(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k) mVar).f31490a, arrayList8);
                            }
                        }
                        arrayList5.add(arrayList7);
                        arrayList6.add(arrayList8);
                    }
                }
                return new C2081m(arrayList2, new C2083a(null, arrayList3, arrayList4), arrayList5, arrayList6);
            case 10:
                View view = (View) obj2;
                if (view.getViewTreeObserver().isAlive()) {
                    view.getViewTreeObserver().removeOnPreDrawListener((I0) obj);
                }
                return c2515c;
            case 11:
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdWebViewRenderer", "Countdown finished - skip button is now available", null, false, 12, null);
                ((N.V) obj2).setValue(Boolean.TRUE);
                ((tf.a) obj).invoke();
                return c2515c;
            default:
                ((m5.c) obj2).getClass();
                StatFs statFs = new StatFs((String) obj);
                return Double.valueOf((statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / 1048576.0f);
        }
    }
}
