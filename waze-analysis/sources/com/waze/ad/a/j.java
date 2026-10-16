package com.waze.ad.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.support.v4.app.ar;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.waze.map.b.am;
import h.ab;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.l;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class j {
    public static final Bitmap a(View view, int i2, int i3, int i4) {
        x.f(view, "<this>");
        d(view, i2, i3, i4);
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        return ViewKt.drawToBitmap(view, Bitmap.Config.ARGB_8888);
    }

    public static final Rect b(View view) {
        x.f(view, "<this>");
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }

    public static final com.waze.shared_infra.s.d c(View view, Runnable runnable) {
        x.f(view, "<this>");
        x.f(runnable, "runnable");
        i iVar = new i(view, runnable);
        view.getViewTreeObserver().addOnGlobalLayoutListener(iVar);
        return new com.waze.car_lib.i.a.d(view, iVar, 1, null);
    }

    public static final void d(View view, int i2, int i3, int i4) {
        x.f(view, "<this>");
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, i4), View.MeasureSpec.makeMeasureSpec(i3, i4));
    }

    public static final void g(View view, boolean z) {
        x.f(view, "<this>");
        view.setVisibility(true != z ? 8 : 0);
    }

    public static /* synthetic */ void i(TextView textView, String str) {
        x.f(textView, "<this>");
        textView.setText(str == null ? "" : str);
        TextView textView2 = textView;
        String str2 = str;
        boolean z = false;
        if (str2 != null && str2.length() != 0) {
            z = true;
        }
        g(textView2, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.content.Intent j(android.content.Context r6, com.waze.feedback.f r7, com.waze.feedback.g r8, java.lang.String r9) {
        /*
            java.lang.String r0 = "context"
            h.g.b.x.f(r6, r0)
            java.lang.String r1 = "feedbackContext"
            h.g.b.x.f(r7, r1)
            java.lang.String r1 = "feedbackType"
            h.g.b.x.f(r8, r1)
            java.lang.String r1 = "feedbackOrigin"
            h.g.b.x.f(r9, r1)
            com.waze.feedback.g r1 = com.waze.feedback.g.f23865a
            int r1 = r8.ordinal()
            if (r1 != 0) goto Ldb
            com.waze.config.d r1 = com.waze.config.ConfigValues.CONFIG_VALUE_FEEDBACK_CORE_URL_PS
            java.lang.String r1 = r1.b()
            h.g.b.x.c(r1)
            com.waze.sharedui.h r2 = com.waze.sharedui.h.k()
            java.util.Locale r2 = r2.d()
            java.lang.String r2 = r2.toString()
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r5 = 0
            r4[r5] = r2
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r4, r3)
            java.lang.String r1 = java.lang.String.format(r1, r2)
            java.lang.String r2 = "format(...)"
            h.g.b.x.e(r1, r2)
            com.waze.sharedui.profile.b r2 = com.waze.sharedui.profile.b.a()
            r2.d()
            java.lang.Long r2 = r2.d()
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = ""
            if (r2 == 0) goto L62
            java.lang.String r5 = "0"
            boolean r5 = h.g.b.x.n(r2, r5)
            if (r3 != r5) goto L60
            r2 = 0
        L60:
            if (r2 != 0) goto L63
        L62:
            r2 = r4
        L63:
            com.waze.sharedui.h r3 = com.waze.sharedui.h.k()
            java.lang.String r3 = r3.c()
            if (r3 != 0) goto L6e
            goto L6f
        L6e:
            r4 = r3
        L6f:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r3 = r2.length()
            if (r3 == 0) goto L78
            r4 = r2
        L78:
            java.lang.String r4 = (java.lang.String) r4
            android.net.Uri r1 = android.net.Uri.parse(r1)
            android.net.Uri$Builder r1 = r1.buildUpon()
            java.lang.String r7 = r7.a()
            android.net.Uri$Builder r7 = r1.appendQueryParameter(r0, r7)
            java.lang.String r8 = r8.a()
            java.lang.String r0 = "channel"
            android.net.Uri$Builder r7 = r7.appendQueryParameter(r0, r8)
            java.lang.String r8 = "origin"
            android.net.Uri$Builder r7 = r7.appendQueryParameter(r8, r9)
            java.lang.String r8 = "log_id"
            android.net.Uri$Builder r7 = r7.appendQueryParameter(r8, r4)
            android.net.Uri r7 = r7.build()
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "toString(...)"
            h.g.b.x.e(r7, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "opening feedback activity, logId="
            r8.<init>(r9)
            r8.append(r4)
            java.lang.String r9 = ", url="
            r8.append(r9)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "FeedbackActivity"
            com.waze.shared_infra.i.h.k(r9, r8)
            java.lang.Class<com.waze.feedback.FeedbackActivity> r8 = com.waze.feedback.FeedbackActivity.class
            android.content.Intent r9 = new android.content.Intent
            r9.<init>(r6, r8)
            java.lang.String r6 = "ARG_FEEDBACK_URL"
            r9.putExtra(r6, r7)
            java.lang.String r6 = "ARG_LOG_ID"
            r9.putExtra(r6, r4)
            return r9
        Ldb:
            h.i r6 = new h.i
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ad.a.j.j(android.content.Context, com.waze.feedback.f, com.waze.feedback.g, java.lang.String):android.content.Intent");
    }

    public static final void k(Context context, com.waze.feedback.f fVar, com.waze.feedback.g gVar, String str) {
        x.f(context, "context");
        x.f(fVar, "feedbackContext");
        x.f(gVar, "feedbackType");
        x.f(str, "feedbackOrigin");
        x.f(context, "context");
        x.f(fVar, "feedbackContext");
        x.f(gVar, "feedbackType");
        x.f(str, "feedbackOrigin");
        context.startActivity(j(context, fVar, gVar, str));
    }

    public static final Uri l(Uri uri, Map map) {
        x.f(uri, "<this>");
        x.f(map, "params");
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.clearQuery();
        Set setKeySet = map.keySet();
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        x.e(queryParameterNames, "getQueryParameterNames(...)");
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : queryParameterNames) {
            if (!setKeySet.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        for (String str : arrayList) {
            List<String> queryParameters = uri.getQueryParameters(str);
            x.e(queryParameters, "getQueryParameters(...)");
            Iterator<T> it = queryParameters.iterator();
            while (it.hasNext()) {
                builderBuildUpon.appendQueryParameter(str, (String) it.next());
            }
        }
        x.c(builderBuildUpon);
        v(builderBuildUpon, map);
        Uri uriBuild = builderBuildUpon.build();
        x.e(uriBuild, "with(...)");
        return uriBuild;
    }

    public static final Uri m(Uri uri, Map map) {
        x.f(uri, "<this>");
        x.f(map, "params");
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.clearQuery();
        Set setKeySet = map.keySet();
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        x.e(queryParameterNames, "getQueryParameterNames(...)");
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : queryParameterNames) {
            if (!setKeySet.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        for (String str : arrayList) {
            builderBuildUpon.appendQueryParameter(str, uri.getQueryParameter(str));
        }
        x.c(builderBuildUpon);
        v(builderBuildUpon, map);
        Uri uriBuild = builderBuildUpon.build();
        x.e(uriBuild, "with(...)");
        return uriBuild;
    }

    public static final Object n(ViewPropertyAnimator viewPropertyAnimator, h.c.e eVar) {
        l lVar = new l(h.c.a.h.d(eVar), 1);
        lVar.u();
        l lVar2 = lVar;
        viewPropertyAnimator.withEndAction(new f(lVar2)).start();
        lVar2.c(new g(viewPropertyAnimator));
        Object objJ = lVar.j();
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (objJ == aVar) {
            h.d.b.c(eVar);
        }
        return objJ == aVar ? objJ : ab.f48028a;
    }

    public static /* synthetic */ Object o(View view, h.c.e eVar) {
        com.waze.z.a.d.d dVar = new com.waze.z.a.d.d(13);
        if (!((Boolean) dVar.invoke(view)).booleanValue()) {
            l lVar = new l(h.c.a.h.d(eVar), 1);
            lVar.u();
            l lVar2 = lVar;
            e eVar2 = new e(dVar, view, lVar2);
            view.getViewTreeObserver().addOnGlobalLayoutListener(eVar2);
            lVar2.c(new d(view, eVar2));
            Object objJ = lVar.j();
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (objJ == aVar) {
                h.d.b.c(eVar);
            }
            if (objJ == aVar) {
                return objJ;
            }
        }
        return ab.f48028a;
    }

    public static final boolean p(Resources resources) {
        x.f(resources, "<this>");
        return resources.getConfiguration().orientation == 1;
    }

    public static final void q(Lifecycle lifecycle, Lifecycle.Event event, h.g.a.a aVar) {
        x.f(lifecycle, "<this>");
        x.f(event, "targetEvent");
        x.f(aVar, "action");
        lifecycle.addObserver(new c(event, lifecycle, aVar));
    }

    public static final com.waze.shared_infra.s.d r(ar arVar, LifecycleOwner lifecycleOwner, h.g.a.a aVar) {
        x.f(arVar, "<this>");
        x.f(lifecycleOwner, "lifecycleOwner");
        x.f(aVar, "onBack");
        b bVar = new b("Fragment (" + arVar.getClass().getName() + ") intercepted BACK click", aVar);
        arVar.requireActivity().getOnBackPressedDispatcher().addCallback(lifecycleOwner, bVar);
        return new am(bVar, 1);
    }

    public static /* synthetic */ com.waze.shared_infra.s.d s(ar arVar, h.g.a.a aVar) {
        LifecycleOwner viewLifecycleOwner = arVar.getViewLifecycleOwner();
        x.e(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        return r(arVar, viewLifecycleOwner, aVar);
    }

    public static final boolean t(Context context) {
        x.f(context, "<this>");
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static final boolean u(Context context) {
        x.f(context, "<this>");
        return ContextCompat.checkSelfPermission(context, "android.permission.RECORD_AUDIO") == 0;
    }

    private static final void v(Uri.Builder builder, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
    }
}
