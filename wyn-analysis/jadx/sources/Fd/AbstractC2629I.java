package fd;

import android.content.Context;
import kotlin.reflect.KProperty;
import u1.InterfaceC4220i;
import w1.C4351b;

/* renamed from: fd.I, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2629I {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f35322a = {new kotlin.jvm.internal.y(AbstractC2629I.class, "sharedPreferencesDataStore", "getSharedPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1)};

    /* renamed from: b, reason: collision with root package name */
    public static final C4351b f35323b = tg.b.M("FlutterSharedPreferences", null, 14);

    public static final InterfaceC4220i a(Context context) {
        return (InterfaceC4220i) f35323b.getValue(context, f35322a[0]);
    }
}
