package u0;

import N.AbstractC0743q;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import com.wynauto.wyn.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public abstract class I0 {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f46125a = new LinkedHashMap();

    public static final Hf.v0 a(Context context) {
        Hf.v0 v0Var;
        LinkedHashMap linkedHashMap = f46125a;
        synchronized (linkedHashMap) {
            try {
                Object objX = linkedHashMap.get(context);
                if (objX == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    Gf.e eVarA = ic.d.a(-1, 6, null);
                    objX = Hf.k0.x(new Hf.f0(new H0(contentResolver, uriFor, new io.flutter.view.c(eVarA, xg.g.v(Looper.getMainLooper()), 3), eVarA, context, null)), Ef.H.e(), new Hf.u0(), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, objX);
                }
                v0Var = (Hf.v0) objX;
            } catch (Throwable th) {
                throw th;
            }
        }
        return v0Var;
    }

    public static final AbstractC0743q b(View view) {
        AbstractC3340k.e(view, "<this>");
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof AbstractC0743q) {
            return (AbstractC0743q) tag;
        }
        return null;
    }
}
