package s4;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import com.applovin.sdk.AppLovinEventTypes;
import com.arthenica.ffmpegkit.FFmpegKitConfig;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.ads.nativead.l;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.json.JSONArray;
import org.json.JSONObject;
import pd.f;
import q.s1;
import qc.C3884a;
import qc.InterfaceC3885b;
import r4.AbstractC3915a;
import r4.C3917c;
import r4.C3918d;
import r4.C3919e;
import r4.C3920f;
import r4.C3923i;
import r4.InterfaceC3922h;
import rc.InterfaceC3964a;
import rc.InterfaceC3965b;
import tc.g;
import uc.C4271h;
import uc.C4273j;
import uc.C4281r;
import uc.InterfaceC4269f;
import uc.InterfaceC4270g;
import uc.InterfaceC4272i;
import uc.InterfaceC4279p;
import uc.InterfaceC4283t;

/* loaded from: classes.dex */
public class b implements InterfaceC3885b, InterfaceC3964a, InterfaceC4279p, InterfaceC4272i, InterfaceC4283t {

    /* renamed from: d, reason: collision with root package name */
    public C4281r f44951d;

    /* renamed from: e, reason: collision with root package name */
    public C4273j f44952e;

    /* renamed from: f, reason: collision with root package name */
    public g f44953f;

    /* renamed from: g, reason: collision with root package name */
    public Context f44954g;

    /* renamed from: h, reason: collision with root package name */
    public Activity f44955h;

    /* renamed from: i, reason: collision with root package name */
    public C3884a f44956i;

    /* renamed from: j, reason: collision with root package name */
    public C4271h f44957j;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f44948a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f44949b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f44950c = Executors.newFixedThreadPool(10);
    public final l k = new l(19);

    public b() {
        Log.d("ffmpeg-kit-flutter", String.format("FFmpegKitFlutterPlugin created %s.", this));
    }

    public static boolean k(Integer num) {
        return num != null && num.intValue() >= 0;
    }

    public static ArrayList l(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
            Object objOpt = jSONArray.opt(i5);
            if (objOpt != null) {
                if (objOpt instanceof JSONArray) {
                    objOpt = l((JSONArray) objOpt);
                } else if (objOpt instanceof JSONObject) {
                    objOpt = n((JSONObject) objOpt);
                }
                arrayList.add(objOpt);
            }
        }
        return arrayList;
    }

    public static HashMap m(l lVar) {
        if (lVar == null) {
            return null;
        }
        new HashMap();
        return n((JSONObject) lVar.f26356b);
    }

    public static HashMap n(JSONObject jSONObject) {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt != null) {
                if (objOpt instanceof JSONArray) {
                    objOpt = l((JSONArray) objOpt);
                } else if (objOpt instanceof JSONObject) {
                    objOpt = n((JSONObject) objOpt);
                }
                map.put(next, objOpt);
            }
        }
        return map;
    }

    public static HashMap o(C3919e c3919e) {
        HashMap map = new HashMap();
        map.put(JsonStorageKeyNames.SESSION_ID_KEY, Long.valueOf(c3919e.f44347a));
        int i5 = c3919e.f44348b;
        map.put(AppLovinEventTypes.USER_COMPLETED_LEVEL, Integer.valueOf(i5 == 0 ? 56 : f.i(i5)));
        map.put(PglCryptUtils.KEY_MESSAGE, c3919e.f44349c);
        return map;
    }

    public static HashMap p(InterfaceC3922h interfaceC3922h) {
        if (interfaceC3922h == null) {
            return null;
        }
        HashMap map = new HashMap();
        AbstractC3915a abstractC3915a = (AbstractC3915a) interfaceC3922h;
        map.put(JsonStorageKeyNames.SESSION_ID_KEY, Long.valueOf(abstractC3915a.f44329a));
        Date date = abstractC3915a.f44330b;
        map.put("createTime", Long.valueOf(date != null ? date.getTime() : 0L));
        Date date2 = abstractC3915a.f44331c;
        map.put("startTime", Long.valueOf(date2 != null ? date2.getTime() : 0L));
        map.put(ExternalParsersConfigReaderMetKeys.COMMAND_TAG, FFmpegKitConfig.a(abstractC3915a.f44333e));
        if (interfaceC3922h.a()) {
            map.put("type", 1);
            return map;
        }
        if (interfaceC3922h.b()) {
            map.put("type", 2);
            return map;
        }
        if (interfaceC3922h.c()) {
            l lVar = ((C3920f) interfaceC3922h).f44350n;
            if (lVar != null) {
                map.put("mediaInformation", m(lVar));
            }
            map.put("type", 3);
        }
        return map;
    }

    public static HashMap q(C3923i c3923i) {
        HashMap map = new HashMap();
        if (c3923i != null) {
            map.put(JsonStorageKeyNames.SESSION_ID_KEY, Long.valueOf(c3923i.f44352a));
            map.put("videoFrameNumber", Integer.valueOf(c3923i.f44353b));
            map.put("videoFps", Float.valueOf(c3923i.f44354c));
            map.put("videoQuality", Float.valueOf(c3923i.f44355d));
            long j8 = c3923i.f44356e;
            if (j8 >= 2147483647L) {
                j8 %= 2147483647L;
            }
            map.put("size", Integer.valueOf((int) j8));
            map.put("time", Double.valueOf(c3923i.f44357f));
            map.put("bitrate", Double.valueOf(c3923i.f44358g));
            map.put("speed", Double.valueOf(c3923i.f44359h));
        }
        return map;
    }

    public static ArrayList r(LinkedList linkedList) {
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < linkedList.size(); i5++) {
            arrayList.add(p((InterfaceC3922h) linkedList.get(i5)));
        }
        return arrayList;
    }

    public final void a(g gVar) {
        synchronized (FFmpegKitConfig.f24188f) {
            FFmpegKitConfig.f24187e.clear();
            FFmpegKitConfig.f24186d.clear();
        }
        this.k.l(gVar, null);
    }

    public final void b(AbstractC3915a abstractC3915a) {
        HashMap map = new HashMap();
        map.put("FFmpegKitCompleteCallbackEvent", p(abstractC3915a));
        ((Handler) this.k.f26356b).post(new Vc.f(this.f44957j, map, 2));
    }

    public final void c() {
        this.f44948a.compareAndSet(false, true);
    }

    public final void d() {
        this.f44949b.compareAndSet(false, true);
    }

    public final void e(g gVar) {
        l lVar = this.k;
        AtomicInteger atomicInteger = FFmpegKitConfig.f24183a;
        LinkedList linkedList = new LinkedList();
        synchronized (FFmpegKitConfig.f24188f) {
            try {
                for (InterfaceC3922h interfaceC3922h : FFmpegKitConfig.f24187e) {
                    if (interfaceC3922h.a()) {
                        linkedList.add((C3917c) interfaceC3922h);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        lVar.l(gVar, r(linkedList));
    }

    public final void f(g gVar) {
        l lVar = this.k;
        AtomicInteger atomicInteger = FFmpegKitConfig.f24183a;
        LinkedList linkedList = new LinkedList();
        synchronized (FFmpegKitConfig.f24188f) {
            try {
                for (InterfaceC3922h interfaceC3922h : FFmpegKitConfig.f24187e) {
                    if (interfaceC3922h.b()) {
                        linkedList.add((C3918d) interfaceC3922h);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        lVar.l(gVar, r(linkedList));
    }

    public final void g(g gVar) {
        InterfaceC3922h interfaceC3922h;
        synchronized (FFmpegKitConfig.f24188f) {
            try {
                int size = FFmpegKitConfig.f24187e.size() - 1;
                while (true) {
                    if (size < 0) {
                        interfaceC3922h = null;
                        break;
                    } else {
                        interfaceC3922h = (InterfaceC3922h) FFmpegKitConfig.f24187e.get(size);
                        if (((AbstractC3915a) interfaceC3922h).f44337i != 4) {
                            size--;
                        }
                    }
                }
            } finally {
            }
        }
        this.k.l(gVar, p(interfaceC3922h));
    }

    public final void h(g gVar) {
        InterfaceC3922h interfaceC3922h;
        synchronized (FFmpegKitConfig.f24188f) {
            try {
                LinkedList linkedList = FFmpegKitConfig.f24187e;
                interfaceC3922h = linkedList.size() > 0 ? (InterfaceC3922h) linkedList.get(linkedList.size() - 1) : null;
            } finally {
            }
        }
        this.k.l(gVar, p(interfaceC3922h));
    }

    public final void i(g gVar) {
        LinkedList linkedList;
        l lVar = this.k;
        synchronized (FFmpegKitConfig.f24188f) {
            linkedList = new LinkedList(FFmpegKitConfig.f24187e);
        }
        lVar.l(gVar, r(linkedList));
    }

    public final void j(Integer num, g gVar) {
        l lVar = this.k;
        int iIntValue = num.intValue();
        int i5 = iIntValue != 0 ? iIntValue != 1 ? iIntValue != 2 ? 4 : 3 : 2 : 1;
        AtomicInteger atomicInteger = FFmpegKitConfig.f24183a;
        LinkedList linkedList = new LinkedList();
        synchronized (FFmpegKitConfig.f24188f) {
            try {
                for (InterfaceC3922h interfaceC3922h : FFmpegKitConfig.f24187e) {
                    if (((AbstractC3915a) interfaceC3922h).f44337i == i5) {
                        linkedList.add(interfaceC3922h);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        lVar.l(gVar, r(linkedList));
    }

    @Override // uc.InterfaceC4283t
    public final boolean onActivityResult(int i5, int i10, Intent intent) {
        Log.d("ffmpeg-kit-flutter", String.format("selectDocument completed with requestCode: %d, resultCode: %d, data: %s.", Integer.valueOf(i5), Integer.valueOf(i10), intent == null ? null : intent.toString()));
        if (i5 != 10000 && i5 != 20000) {
            Log.i("ffmpeg-kit-flutter", String.format("FFmpegKitFlutterPlugin ignored unsupported activity result for requestCode: %d.", Integer.valueOf(i5)));
            return false;
        }
        l lVar = this.k;
        if (i10 != -1) {
            lVar.j("SELECT_CANCELLED", String.valueOf(i10), this.f44953f);
        } else if (intent == null) {
            lVar.l(this.f44953f, null);
        } else {
            Uri data = intent.getData();
            lVar.l(this.f44953f, data != null ? data.toString() : null);
        }
        return true;
    }

    @Override // rc.InterfaceC3964a
    public final void onAttachedToActivity(InterfaceC3965b interfaceC3965b) {
        s1 s1Var = (s1) interfaceC3965b;
        Log.d("ffmpeg-kit-flutter", String.format("FFmpegKitFlutterPlugin %s attached to activity %s.", this, (Activity) s1Var.f43896a));
        C3884a c3884a = this.f44956i;
        InterfaceC4269f interfaceC4269f = c3884a.f44188c;
        FFmpegKitConfig.f24192j = new a(this);
        FFmpegKitConfig.k = new a(this);
        FFmpegKitConfig.f24193l = new a(this);
        FFmpegKitConfig.f24190h = new a(this);
        FFmpegKitConfig.f24191i = new a(this);
        if (this.f44951d == null) {
            C4281r c4281r = new C4281r(interfaceC4269f, "flutter.arthenica.com/ffmpeg_kit");
            this.f44951d = c4281r;
            c4281r.b(this);
        } else {
            Log.i("ffmpeg-kit-flutter", "FFmpegKitFlutterPlugin method channel was already initialised.");
        }
        if (this.f44952e == null) {
            C4273j c4273j = new C4273j(interfaceC4269f, "flutter.arthenica.com/ffmpeg_kit_event");
            this.f44952e = c4273j;
            c4273j.a(this);
        } else {
            Log.i("ffmpeg-kit-flutter", "FFmpegKitFlutterPlugin event channel was already initialised.");
        }
        Context context = c3884a.f44186a;
        this.f44954g = context;
        Activity activity = (Activity) s1Var.f43896a;
        this.f44955h = activity;
        s1Var.b(this);
        Log.d("ffmpeg-kit-flutter", String.format("FFmpegKitFlutterPlugin %s initialised with context %s and activity %s.", this, context, activity));
    }

    @Override // qc.InterfaceC3885b
    public final void onAttachedToEngine(C3884a c3884a) {
        this.f44956i = c3884a;
    }

    @Override // uc.InterfaceC4272i
    public final void onCancel(Object obj) {
        this.f44957j = null;
        Log.d("ffmpeg-kit-flutter", "FFmpegKitFlutterPlugin stopped listening to events.");
    }

    @Override // rc.InterfaceC3964a
    public final void onDetachedFromActivity() {
        C4281r c4281r = this.f44951d;
        if (c4281r == null) {
            Log.i("ffmpeg-kit-flutter", "FFmpegKitFlutterPlugin method channel was already uninitialised.");
        } else {
            c4281r.b(null);
            this.f44951d = null;
        }
        C4273j c4273j = this.f44952e;
        if (c4273j == null) {
            Log.i("ffmpeg-kit-flutter", "FFmpegKitFlutterPlugin event channel was already uninitialised.");
        } else {
            c4273j.a(null);
            this.f44952e = null;
        }
        this.f44954g = null;
        this.f44955h = null;
        Log.d("ffmpeg-kit-flutter", "FFmpegKitFlutterPlugin uninitialized.");
        Log.d("ffmpeg-kit-flutter", "FFmpegKitFlutterPlugin detached from activity.");
    }

    @Override // rc.InterfaceC3964a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // qc.InterfaceC3885b
    public final void onDetachedFromEngine(C3884a c3884a) {
        this.f44956i = null;
    }

    @Override // uc.InterfaceC4272i
    public final void onListen(Object obj, InterfaceC4270g interfaceC4270g) {
        this.f44957j = (C4271h) interfaceC4270g;
        Log.d("ffmpeg-kit-flutter", String.format("FFmpegKitFlutterPlugin %s started listening to events on %s.", this, interfaceC4270g));
    }

    /* JADX WARN: Removed duplicated region for block: B:855:0x0ee1  */
    @Override // uc.InterfaceC4279p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMethodCall(uc.C4278o r22, uc.InterfaceC4280q r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 4404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.b.onMethodCall(uc.o, uc.q):void");
    }

    @Override // rc.InterfaceC3964a
    public final void onReattachedToActivityForConfigChanges(InterfaceC3965b interfaceC3965b) {
        onAttachedToActivity(interfaceC3965b);
    }
}
