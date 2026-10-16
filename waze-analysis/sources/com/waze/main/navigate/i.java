package com.waze.main.navigate;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.firebase.messaging.l;
import com.waze.R;
import com.waze.jni.protos.navigate.NavigationItem;
import com.waze.jni.protos.navigate.NavigationItemList;
import com.waze.navigate.df;
import com.waze.navigate.ee;
import com.waze.resources.ResourcesNativeManager;
import com.waze.ui.z.as;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class i extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    private NavigationItemList f25511a;

    /* renamed from: b, reason: collision with root package name */
    private final LayoutInflater f25512b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f25513c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f25514d;

    /* renamed from: e, reason: collision with root package name */
    private final String f25515e;

    /* renamed from: f, reason: collision with root package name */
    private final String f25516f;

    /* renamed from: g, reason: collision with root package name */
    private final String f25517g;

    /* renamed from: h, reason: collision with root package name */
    private final String f25518h;

    /* renamed from: i, reason: collision with root package name */
    private final l f25519i;

    public i(Context context, boolean z, String str, String str2, String str3, String str4, l lVar) {
        this.f25512b = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f25513c = z;
        this.f25514d = context;
        this.f25515e = str;
        this.f25516f = str2;
        this.f25517g = str3;
        this.f25518h = str4;
        this.f25519i = lVar;
    }

    public static /* synthetic */ void b(i iVar, NavigationItem navigationItem) {
        l lVar = iVar.f25519i;
        if (lVar != null) {
            ((com.waze.main_screen.l.b.b) lVar.f10212a).a(navigationItem);
        }
    }

    private final void c(View view, CharSequence charSequence, boolean z) {
        TextView textView = (TextView) view.findViewById(R.id.navListItemStreetName);
        textView.setText(charSequence);
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new h(this, textView, z));
    }

    private static final void d(Context context, ee eeVar, LinearLayout linearLayout) {
        if (eeVar == null || eeVar.c().isEmpty() || linearLayout == null) {
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                return;
            }
            return;
        }
        linearLayout.removeAllViews();
        Iterator it = eeVar.c().iterator();
        while (it.hasNext()) {
            Bitmap encBitmap = ResourcesNativeManager.getInstance().getEncBitmap(((df) it.next()).a());
            if (encBitmap != null) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) ((encBitmap.getWidth() / encBitmap.getHeight()) * as.h(context.getResources(), 28)), as.h(context.getResources(), 28));
                layoutParams.leftMargin = as.h(context.getResources(), 5);
                ImageView imageView = new ImageView(context);
                imageView.setImageBitmap(encBitmap);
                imageView.setLayoutParams(layoutParams);
                linearLayout.addView(imageView, layoutParams);
            }
        }
        linearLayout.setVisibility(linearLayout.getChildCount() > 0 ? 0 : 8);
    }

    public final void a(NavigationItemList navigationItemList) {
        this.f25511a = navigationItemList;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        NavigationItemList navigationItemList = this.f25511a;
        if (navigationItemList == null) {
            return 0;
        }
        return navigationItemList.getNavigationItemCount();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i2) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b6 A[PHI: r8
  0x00b6: PHI (r8v4 java.lang.String) = (r8v3 java.lang.String), (r8v3 java.lang.String), (r8v7 java.lang.String), (r8v7 java.lang.String) binds: [B:36:0x009b, B:38:0x00a3, B:41:0x00ac, B:43:0x00b4] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r13, android.view.View r14, android.view.ViewGroup r15) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.main.navigate.i.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
