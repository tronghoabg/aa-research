package fd;

import a9.C1342b;
import android.content.Context;
import android.util.Base64;
import android.util.Log;
import ef.C2515C;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import jf.C3109i;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import qc.C3884a;
import qc.InterfaceC3885b;
import uc.InterfaceC4269f;
import x1.C4452e;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001:B\u0007¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J \u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J \u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001e\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0002\u0010\u001bJ \u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J \u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J&\u0010 \u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140!2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J \u0010\"\u001a\u00020\u000b2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010!2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J,\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020&0%2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010!2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001f\u0010'\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0016¢\u0006\u0002\u0010(J\u001f\u0010)\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0016¢\u0006\u0002\u0010*J\u001f\u0010+\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0016¢\u0006\u0002\u0010,J\u001a\u0010-\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J \u0010.\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010!2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J&\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00140!2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010!2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J*\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020&0%2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010!H\u0082@¢\u0006\u0002\u00101J\u001a\u00102\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u000304\u0018\u000103H\u0082@¢\u0006\u0002\u00105J\u001c\u00106\u001a\u0004\u0018\u00010&2\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u000304H\u0082@¢\u0006\u0002\u00107J*\u00108\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010&2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u000103H\u0002J\u0014\u00109\u001a\u0004\u0018\u00010&2\b\u0010\u0015\u001a\u0004\u0018\u00010&H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesAsyncApi;", "<init>", "()V", "listEncoder", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesListEncoder;", "(Lio/flutter/plugins/sharedpreferences/SharedPreferencesListEncoder;)V", "context", "Landroid/content/Context;", "setUp", "", "messenger", "Lio/flutter/plugin/common/BinaryMessenger;", "onAttachedToEngine", "binding", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "onDetachedFromEngine", "setBool", ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, "", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "", "options", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;", "setString", "dataStoreSetString", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setInt", "", "setDouble", "", "setStringList", "", "clear", "allowList", "getAll", "", "", "getInt", "(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)Ljava/lang/Long;", "getBool", "(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)Ljava/lang/Boolean;", "getDouble", "(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)Ljava/lang/Double;", "getString", "getStringList", "getKeys", "getPrefs", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readAllKeys", "", "Landroidx/datastore/preferences/core/Preferences$Key;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getValueByKey", "(Landroidx/datastore/preferences/core/Preferences$Key;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "preferencesFilter", "transformPref", "ListEncoder", "shared_preferences_android_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* renamed from: fd.H, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2628H implements InterfaceC3885b, InterfaceC2634e {

    /* renamed from: a, reason: collision with root package name */
    public Context f35320a;

    /* renamed from: b, reason: collision with root package name */
    public final C1342b f35321b = new C1342b();

    public static final Object a(C2628H c2628h, String str, String str2, AbstractC3471j abstractC3471j) {
        c2628h.getClass();
        C4452e c4452e = new C4452e(str);
        Context context = c2628h.f35320a;
        if (context != null) {
            Object objD0 = android.support.v4.media.session.b.d0(AbstractC2629I.a(context), new C2639j(c4452e, str2, null), abstractC3471j);
            return objD0 == kf.a.f39711a ? objD0 : C2515C.f34653a;
        }
        AbstractC3340k.m("context");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0088, code lost:
    
        if (r15 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d1, code lost:
    
        if (r15 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d3, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0103 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00d1 -> B:35:0x00d4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(fd.C2628H r13, java.util.List r14, lf.AbstractC3464c r15) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fd.C2628H.b(fd.H, java.util.List, lf.c):java.lang.Object");
    }

    public final String c(String str, C2636g c2636g) throws Throwable {
        kotlin.jvm.internal.G g9 = new kotlin.jvm.internal.G();
        Ef.H.I(C3109i.f38759a, new w(str, this, g9, null));
        return (String) g9.f39740a;
    }

    public final Object d(Object obj) throws ClassNotFoundException, IOException {
        if (obj instanceof String) {
            String str = (String) obj;
            if (Bf.r.k0(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false)) {
                C1342b c1342b = this.f35321b;
                String listString = str.substring(40);
                AbstractC3340k.d(listString, "substring(...)");
                c1342b.getClass();
                AbstractC3340k.e(listString, "listString");
                Object object = new J(new ByteArrayInputStream(Base64.decode(listString, 0))).readObject();
                AbstractC3340k.c(object, "null cannot be cast to non-null type kotlin.collections.List<*>");
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) object) {
                    if (obj2 instanceof String) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            }
        }
        return obj;
    }

    @Override // qc.InterfaceC3885b
    public final void onAttachedToEngine(C3884a binding) {
        AbstractC3340k.e(binding, "binding");
        InterfaceC4269f interfaceC4269f = binding.f44188c;
        AbstractC3340k.d(interfaceC4269f, "getBinaryMessenger(...)");
        Context context = binding.f44186a;
        AbstractC3340k.d(context, "getApplicationContext(...)");
        this.f35320a = context;
        try {
            InterfaceC2634e.f35332Z8.getClass();
            C2633d.b(interfaceC4269f, this);
        } catch (Exception e7) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e7);
        }
        new C2630a().onAttachedToEngine(binding);
    }

    @Override // qc.InterfaceC3885b
    public final void onDetachedFromEngine(C3884a binding) {
        AbstractC3340k.e(binding, "binding");
        InterfaceC4269f interfaceC4269f = binding.f44188c;
        AbstractC3340k.d(interfaceC4269f, "getBinaryMessenger(...)");
        InterfaceC2634e.f35332Z8.getClass();
        C2633d.b(interfaceC4269f, null);
    }
}
