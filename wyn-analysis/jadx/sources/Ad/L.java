package ad;

import A7.C0295v;
import D6.c1;
import E5.C0441b;
import a2.C1323c;
import android.content.ClipDescription;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.BackEvent;
import ba.C1521a;
import bd.EnumC1524a;
import cb.AbstractC1593a;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.ads.nativetemplates.TemplateView;
import com.google.android.gms.ads.AdRequest$Builder;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.common.api.internal.InterfaceC1708w;
import com.google.android.gms.common.internal.InterfaceC1716e;
import com.google.android.gms.internal.fido.zzp;
import com.google.android.gms.internal.fido.zzs;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.unity3d.services.UnityAdsConstants;
import e0.InterfaceC2463o;
import f4.C2556c;
import f4.C2557d;
import f4.InterfaceC2561h;
import f4.InterfaceC2562i;
import h1.InterfaceC2766a;
import io.flutter.embedding.engine.FlutterJNI;
import j9.C3094d;
import j9.C3095e;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import k1.C3112A;
import k1.C3137y;
import ka.AbstractC3256n;
import l1.C3375e;
import m8.C3498e;
import md.b0;
import net.zetetic.database.sqlcipher.SQLiteConnection;
import net.zetetic.database.sqlcipher.SQLiteDatabaseHook;
import p5.C3768a;
import p7.AbstractC3772b;
import q.InterfaceC3822l;
import u0.C4188n;
import uc.C4278o;
import uc.C4281r;
import uc.C4287x;
import uc.C4288y;
import uc.InterfaceC4267d;
import uc.InterfaceC4279p;
import uc.InterfaceC4280q;
import v7.C4330y;
import x6.C4476g;

/* loaded from: classes5.dex */
public class L implements com.google.android.gms.ads.nativead.d, InterfaceC1716e, InterfaceC2561h, SQLiteDatabaseHook, InterfaceC2766a, p.w, InterfaceC4267d, org.chromium.net.c, InterfaceC3822l, InterfaceC4279p, InterfaceC1708w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17514a;

    /* renamed from: b, reason: collision with root package name */
    public Object f17515b;

    public /* synthetic */ L(Object obj, int i5) {
        this.f17514a = i5;
        this.f17515b = obj;
    }

    public static HashMap f(BackEvent backEvent) {
        HashMap map = new HashMap(3);
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        map.put("touchOffset", (Float.isNaN(touchX) || Float.isNaN(touchY)) ? null : Arrays.asList(Float.valueOf(touchX), Float.valueOf(touchY)));
        map.put("progress", Float.valueOf(backEvent.getProgress()));
        map.put("swipeEdge", Integer.valueOf(backEvent.getSwipeEdge()));
        return map;
    }

    public static boolean r(int i5) {
        return (48 <= i5 && i5 <= 57) || i5 == 35 || i5 == 42;
    }

    @Override // p.w
    public boolean F(p.k kVar) {
        Window.Callback callback;
        if (kVar != kVar.k()) {
            return true;
        }
        j.w wVar = (j.w) this.f17515b;
        if (!wVar.f38510F || (callback = wVar.f38538l.getCallback()) == null || wVar.f38520Q) {
            return true;
        }
        callback.onMenuOpened(108, kVar);
        return true;
    }

    @Override // f4.InterfaceC2561h
    public void O(C2556c c2556c, Bitmap bitmap, Map map) {
        ((InterfaceC2562i) this.f17515b).r(c2556c, bitmap, map, AbstractC3772b.t(bitmap));
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteDatabaseHook
    public void a(SQLiteConnection sQLiteConnection) throws Exception {
        if (sQLiteConnection.l("PRAGMA cipher_migrate;", null) != 0) {
            throw ((Exception) this.f17515b);
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
    public void accept(Object obj, Object obj2) throws RemoteException {
        ((zzs) ((zzp) obj).getService()).zzc(new u7.b((TaskCompletionSource) obj2), (C4330y) this.f17515b);
    }

    @Override // h1.InterfaceC2766a
    public Cursor c(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f17515b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e7) {
            Log.w("FontsProvider", "Unable to query the content provider", e7);
            return null;
        }
    }

    @Override // h1.InterfaceC2766a
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f17515b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // uc.InterfaceC4267d
    public void d(ByteBuffer byteBuffer, mc.g gVar) {
        C4288y.f46771b.getClass();
        C4288y.c(byteBuffer);
        ((mc.b) this.f17515b).getClass();
    }

    public boolean e(s9.m mVar) {
        A6.c.z(mVar.f45369a.size() % 2 == 1, "Expected a collection path.", new Object[0]);
        String strF = mVar.f();
        s9.m mVar2 = (s9.m) mVar.k();
        HashMap map = (HashMap) this.f17515b;
        HashSet hashSet = (HashSet) map.get(strF);
        if (hashSet == null) {
            hashSet = new HashSet();
            map.put(strF, hashSet);
        }
        return hashSet.add(mVar2);
    }

    @Override // org.chromium.net.c
    public FileChannel g() {
        return new FileInputStream((File) this.f17515b).getChannel();
    }

    public C4476g h(String str) {
        if (str.isEmpty()) {
            AdRequest$Builder adRequest$BuilderN = n();
            adRequest$BuilderN.getClass();
            return new C4476g(adRequest$BuilderN);
        }
        AdRequest$Builder adString = n().setAdString(str);
        adString.getClass();
        return new C4476g(adString);
    }

    public C3375e i(int i5) {
        return null;
    }

    public String j(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            C3094d c3094d = (C3094d) this.f17515b;
            C3095e c3095e = new C3095e(stringWriter, c3094d.f38682a, c3094d.f38683b, c3094d.f38684c, c3094d.f38685d);
            c3095e.a(obj);
            c3095e.c();
            c3095e.f38687b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    public C3375e k(int i5) {
        return null;
    }

    @Override // p.w
    public void l(p.k kVar, boolean z2) {
        j.v vVar;
        p.k kVarK = kVar.k();
        int i5 = 0;
        boolean z10 = kVarK != kVar;
        if (z10) {
            kVar = kVarK;
        }
        j.w wVar = (j.w) this.f17515b;
        j.v[] vVarArr = wVar.L;
        int length = vVarArr != null ? vVarArr.length : 0;
        while (true) {
            if (i5 < length) {
                vVar = vVarArr[i5];
                if (vVar != null && vVar.f38493h == kVar) {
                    break;
                } else {
                    i5++;
                }
            } else {
                vVar = null;
                break;
            }
        }
        if (vVar != null) {
            if (!z10) {
                wVar.r(vVar, z2);
            } else {
                wVar.p(vVar.f38486a, vVar, kVarK);
                wVar.r(vVar, true);
            }
        }
    }

    @Override // f4.InterfaceC2561h
    public C2557d m(C2556c c2556c) {
        return null;
    }

    public AdRequest$Builder n() {
        return new AdRequest$Builder(14).setRequestAgent(((c1) this.f17515b).f2412a).addNetworkExtrasBundle(AdMobAdapter.class, AbstractC3256n.b("query_info_type", "requester_type_5"));
    }

    public int o() {
        SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f17515b;
        return Math.max(0, (sideSheetBehavior.f26999m - sideSheetBehavior.f26998l) - sideSheetBehavior.f27000n);
    }

    @Override // uc.InterfaceC4279p
    public void onMethodCall(C4278o c4278o, InterfaceC4280q interfaceC4280q) {
        Object obj;
        switch (this.f17514a) {
            case 26:
                C1323c c1323c = (C1323c) this.f17515b;
                if (((wc.a) c1323c.f17156b) != null) {
                    String str = c4278o.f46759a;
                    try {
                        if (str.hashCode() == -1307105544 && str.equals("activateSystemCursor")) {
                            try {
                                ((wc.a) c1323c.f17156b).a((String) ((HashMap) c4278o.f46760b).get("kind"));
                                ((tc.g) interfaceC4280q).a(Boolean.TRUE);
                            } catch (Exception e7) {
                                ((tc.g) interfaceC4280q).b("error", "Error when setting cursors: " + e7.getMessage(), null);
                            }
                        }
                        break;
                    } catch (Exception e10) {
                        ((tc.g) interfaceC4280q).b("error", "Unhandled error: " + e10.getMessage(), null);
                        return;
                    }
                }
                break;
            case 27:
                Y2.B b5 = (Y2.B) this.f17515b;
                if (((io.flutter.plugin.platform.n) b5.f16384c) != null) {
                    String str2 = c4278o.f46759a;
                    str2.getClass();
                    obj = c4278o.f46760b;
                    switch (str2) {
                        case "create":
                            Map map = (Map) obj;
                            try {
                                ((io.flutter.plugin.platform.n) b5.f16384c).d(new M2.d((String) map.get("viewType"), map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null, ((Integer) map.get("id")).intValue(), ((Integer) map.get("direction")).intValue()));
                                ((tc.g) interfaceC4280q).a(null);
                                break;
                            } catch (IllegalStateException e11) {
                                ((tc.g) interfaceC4280q).b("error", Log.getStackTraceString(e11), null);
                                return;
                            }
                        case "clearFocus":
                            try {
                                ((io.flutter.plugin.platform.n) b5.f16384c).b(((Integer) obj).intValue());
                                ((tc.g) interfaceC4280q).a(null);
                                break;
                            } catch (IllegalStateException e12) {
                                ((tc.g) interfaceC4280q).b("error", Log.getStackTraceString(e12), null);
                                return;
                            }
                        case "touch":
                            List list = (List) obj;
                            try {
                                ((io.flutter.plugin.platform.n) b5.f16384c).i(new tc.f(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                                ((tc.g) interfaceC4280q).a(null);
                                break;
                            } catch (IllegalStateException e13) {
                                ((tc.g) interfaceC4280q).b("error", Log.getStackTraceString(e13), null);
                                return;
                            }
                        case "setDirection":
                            Map map2 = (Map) obj;
                            try {
                                ((io.flutter.plugin.platform.n) b5.f16384c).l(((Integer) map2.get("id")).intValue(), ((Integer) map2.get("direction")).intValue());
                                ((tc.g) interfaceC4280q).a(null);
                                break;
                            } catch (IllegalStateException e14) {
                                ((tc.g) interfaceC4280q).b("error", Log.getStackTraceString(e14), null);
                                return;
                            }
                        case "isSurfaceControlEnabled":
                            FlutterJNI flutterJNI = ((io.flutter.plugin.platform.p) ((io.flutter.plugin.platform.n) b5.f16384c).f37116b).f37121e;
                            ((tc.g) interfaceC4280q).a(Boolean.valueOf(flutterJNI != null ? flutterJNI.IsSurfaceControlEnabled() : false));
                            break;
                        case "dispose":
                            try {
                                ((io.flutter.plugin.platform.n) b5.f16384c).e(((Integer) ((Map) obj).get("id")).intValue());
                                ((tc.g) interfaceC4280q).a(null);
                                break;
                            } catch (IllegalStateException e15) {
                                ((tc.g) interfaceC4280q).b("error", Log.getStackTraceString(e15), null);
                                return;
                            }
                        default:
                            ((tc.g) interfaceC4280q).c();
                            break;
                    }
                }
                break;
            default:
                tc.j jVar = (tc.j) this.f17515b;
                if (((io.flutter.plugin.editing.f) jVar.f46015a) != null) {
                    String str3 = c4278o.f46759a;
                    Object obj2 = c4278o.f46760b;
                    str3.getClass();
                    if (!str3.equals("SpellCheck.initiateSpellCheck")) {
                        ((tc.g) interfaceC4280q).c();
                        break;
                    } else {
                        try {
                            ArrayList arrayList = (ArrayList) obj2;
                            ((io.flutter.plugin.editing.f) jVar.f46015a).a((String) arrayList.get(0), (String) arrayList.get(1), (tc.g) interfaceC4280q);
                            break;
                        } catch (IllegalStateException e16) {
                            ((tc.g) interfaceC4280q).b("error", e16.getMessage(), null);
                        }
                    }
                }
                break;
        }
    }

    @Override // com.google.android.gms.ads.nativead.d
    public void onNativeAdLoaded(NativeAd nativeAd) {
        WeakReference weakReference = (WeakReference) this.f17515b;
        if (weakReference.get() != null) {
            J j8 = (J) weakReference.get();
            bd.b bVar = j8.f17511h;
            bVar.getClass();
            TemplateView templateView = (TemplateView) ((LayoutInflater) j8.f17513j.getSystemService("layout_inflater")).inflate(bVar.f19446a.f19458a, (ViewGroup) null);
            C3768a c3768a = new C3768a();
            ColorDrawable colorDrawable = bVar.f19447b;
            if (colorDrawable != null) {
                c3768a.f43253q = colorDrawable;
            }
            bd.c cVar = bVar.f19448c;
            if (cVar != null) {
                ColorDrawable colorDrawable2 = cVar.f19453b;
                if (colorDrawable2 != null) {
                    c3768a.f43241d = colorDrawable2;
                }
                ColorDrawable colorDrawable3 = cVar.f19452a;
                if (colorDrawable3 != null) {
                    c3768a.f43240c = Integer.valueOf(colorDrawable3.getColor());
                }
                EnumC1524a enumC1524a = cVar.f19454c;
                if (enumC1524a != null) {
                    c3768a.f43238a = enumC1524a.a();
                }
                if (cVar.a() != null) {
                    c3768a.f43239b = cVar.a().floatValue();
                }
            }
            bd.c cVar2 = bVar.f19449d;
            if (cVar2 != null) {
                ColorDrawable colorDrawable4 = cVar2.f19453b;
                if (colorDrawable4 != null) {
                    c3768a.f43245h = colorDrawable4;
                }
                ColorDrawable colorDrawable5 = cVar2.f19452a;
                if (colorDrawable5 != null) {
                    c3768a.f43244g = Integer.valueOf(colorDrawable5.getColor());
                }
                EnumC1524a enumC1524a2 = cVar2.f19454c;
                if (enumC1524a2 != null) {
                    c3768a.f43242e = enumC1524a2.a();
                }
                if (cVar2.a() != null) {
                    c3768a.f43243f = cVar2.a().floatValue();
                }
            }
            bd.c cVar3 = bVar.f19450e;
            if (cVar3 != null) {
                ColorDrawable colorDrawable6 = cVar3.f19453b;
                if (colorDrawable6 != null) {
                    c3768a.f43248l = colorDrawable6;
                }
                ColorDrawable colorDrawable7 = cVar3.f19452a;
                if (colorDrawable7 != null) {
                    c3768a.k = Integer.valueOf(colorDrawable7.getColor());
                }
                EnumC1524a enumC1524a3 = cVar3.f19454c;
                if (enumC1524a3 != null) {
                    c3768a.f43246i = enumC1524a3.a();
                }
                if (cVar3.a() != null) {
                    c3768a.f43247j = cVar3.a().floatValue();
                }
            }
            bd.c cVar4 = bVar.f19451f;
            if (cVar4 != null) {
                ColorDrawable colorDrawable8 = cVar4.f19453b;
                if (colorDrawable8 != null) {
                    c3768a.f43252p = colorDrawable8;
                }
                ColorDrawable colorDrawable9 = cVar4.f19452a;
                if (colorDrawable9 != null) {
                    c3768a.f43251o = Integer.valueOf(colorDrawable9.getColor());
                }
                EnumC1524a enumC1524a4 = cVar4.f19454c;
                if (enumC1524a4 != null) {
                    c3768a.f43249m = enumC1524a4.a();
                }
                if (cVar4.a() != null) {
                    c3768a.f43250n = cVar4.a().floatValue();
                }
            }
            templateView.setStyles(c3768a);
            j8.f17512i = templateView;
            templateView.setNativeAd(nativeAd);
            G9.e eVar = j8.f17505b;
            nativeAd.setOnPaidEventListener(new S3.e(eVar, false, j8, 28));
            eVar.z(j8.f17586a, nativeAd.getResponseInfo());
        }
    }

    public c9.d p(int i5) {
        p9.z zVarE = ((p9.s) this.f17515b).e();
        p9.y yVar = (p9.y) zVarE.f43437g.get(Integer.valueOf(i5));
        if (yVar != null && yVar.f43430b) {
            return s9.h.f45374c.a(yVar.f43429a);
        }
        c9.d dVar = s9.h.f45374c;
        HashMap map = zVarE.f43434d;
        if (map.containsKey(Integer.valueOf(i5))) {
            for (p9.u uVar : (List) map.get(Integer.valueOf(i5))) {
                HashMap map2 = zVarE.f43433c;
                if (map2.containsKey(uVar)) {
                    c9.d dVarA = (c9.d) ((p9.w) map2.get(uVar)).f43428c.f43326e;
                    if (dVar.f19805a.size() >= dVarA.f19805a.size()) {
                        dVarA = dVar;
                        dVar = dVarA;
                    }
                    Iterator it = dVar.iterator();
                    while (true) {
                        C0295v c0295v = (C0295v) it;
                        if (!((Iterator) c0295v.f1081b).hasNext()) {
                            break;
                        }
                        dVarA = dVarA.a(c0295v.next());
                    }
                    dVar = dVarA;
                }
            }
        }
        return dVar;
    }

    public void q(float f10, float f11, float f12, float f13) {
        C1521a c1521a = (C1521a) this.f17515b;
        InterfaceC2463o interfaceC2463oV = c1521a.v();
        long jI = com.moloco.sdk.internal.publisher.H.I(d0.f.d(c1521a.y()) - (f12 + f10), d0.f.b(c1521a.y()) - (f13 + f11));
        if (d0.f.d(jI) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || d0.f.b(jI) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new IllegalArgumentException("Width and height must be greater than or equal to zero");
        }
        c1521a.J(jI);
        interfaceC2463oV.f(f10, f11);
    }

    public void s(int i5, int i10, long j8, int i11) {
        HashMap mapL = AbstractC1593a.l("event", "initialized");
        N0.a.p(i5, mapL, "width", i10, "height");
        mapL.put("duration", Long.valueOf(j8));
        if (i11 != 0) {
            mapL.put("rotationCorrection", Integer.valueOf(i11));
        }
        ((hd.n) this.f17515b).a(mapL);
    }

    public boolean t(int i5, int i10, Bundle bundle) {
        return false;
    }

    public C0441b u(Y2.B b5, C4188n c4188n) {
        boolean z2;
        long j8;
        long j10;
        ArrayList arrayList = (ArrayList) b5.f16383b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(arrayList.size());
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            p0.m mVar = (p0.m) arrayList.get(i5);
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.f17515b;
            p0.l lVar = (p0.l) linkedHashMap2.get(new p0.j(mVar.f43154a));
            if (lVar == null) {
                j10 = mVar.f43155b;
                j8 = mVar.f43157d;
                z2 = false;
            } else {
                long jT = c4188n.t(lVar.f43152b);
                long j11 = lVar.f43151a;
                z2 = lVar.f43153c;
                j8 = jT;
                j10 = j11;
            }
            long j12 = mVar.f43154a;
            int i10 = i5;
            ArrayList arrayList2 = arrayList;
            int i11 = size;
            linkedHashMap.put(new p0.j(j12), new p0.k(j12, mVar.f43155b, mVar.f43157d, mVar.f43158e, j10, j8, z2, mVar.f43159f, mVar.f43161h, mVar.f43162i));
            long j13 = mVar.f43154a;
            boolean z10 = mVar.f43158e;
            if (z10) {
                linkedHashMap2.put(new p0.j(j13), new p0.l(mVar.f43155b, mVar.f43156c, z10));
            } else {
                linkedHashMap2.remove(new p0.j(j13));
            }
            i5 = i10 + 1;
            arrayList = arrayList2;
            size = i11;
        }
        return new C0441b(linkedHashMap, b5);
    }

    public void v(float f10, float f11) {
        ((C1521a) this.f17515b).v().f(f10, f11);
    }

    public void w(b0 b0Var, byte[] bArr) {
        Xd.b.c();
        try {
            String str = "/" + ((String) ((pd.k) this.f17515b).f43533j.f4012c);
            if (bArr != null) {
                ((pd.k) this.f17515b).f43539q = true;
                str = str + "?" + C3498e.f40402d.c(bArr);
            }
            synchronized (((pd.k) this.f17515b).f43536n.f43528w) {
                pd.j.k(((pd.k) this.f17515b).f43536n, b0Var, str);
            }
            Xd.b.f16226a.getClass();
        } catch (Throwable th) {
            try {
                Xd.b.f16226a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public /* synthetic */ L(u7.a aVar, C4330y c4330y) {
        this.f17514a = 29;
        this.f17515b = c4330y;
    }

    public L(mc.b bVar) {
        this.f17514a = 25;
        androidx.fragment.app.X x5 = new androidx.fragment.app.X(13);
        C4281r c4281r = new C4281r(bVar, "flutter/backgesture", C4287x.f46768b, null);
        this.f17515b = c4281r;
        c4281r.b(x5);
    }

    public L(View view) {
        this.f17514a = 12;
        if (Build.VERSION.SDK_INT >= 30) {
            C3112A c3112a = new C3112A(view);
            c3112a.f38763b = view;
            this.f17515b = c3112a;
            return;
        }
        this.f17515b = new C3137y(view);
    }

    public L(J j8) {
        this.f17514a = 0;
        this.f17515b = new WeakReference(j8);
    }

    public L(int i5) {
        this.f17514a = i5;
        switch (i5) {
            case 16:
                this.f17515b = new CopyOnWriteArrayList();
                break;
            case 19:
                this.f17515b = new LinkedHashMap();
                break;
            case 23:
                break;
            case 24:
                this.f17515b = new HashMap();
                break;
            default:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f17515b = new l1.g(this);
                    break;
                } else {
                    this.f17515b = new l1.f(this);
                    break;
                }
        }
    }

    @Override // f4.InterfaceC2561h
    public void b(int i5) {
    }

    public L(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f17514a = 14;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f17515b = new m1.f(uri, clipDescription, uri2);
        } else {
            this.f17515b = new b7.k(29, uri, clipDescription, uri2, false);
        }
    }

    public L(Context context, Uri uri) {
        this.f17514a = 7;
        this.f17515b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }
}
