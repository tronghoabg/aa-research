package com.waze.sharedui.g;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.cf;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.waze.R;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class i extends com.waze.sharedui.d.a.d implements com.waze.sharedui.f {

    /* renamed from: a, reason: collision with root package name */
    private String f38958a;

    /* renamed from: b, reason: collision with root package name */
    private final LayoutInflater f38959b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f38960c;

    /* renamed from: d, reason: collision with root package name */
    private RecyclerView f38961d;

    /* renamed from: e, reason: collision with root package name */
    private b f38962e;

    /* renamed from: f, reason: collision with root package name */
    private float f38963f;

    /* renamed from: g, reason: collision with root package name */
    private int f38964g;

    /* renamed from: h, reason: collision with root package name */
    private int f38965h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f38966i;

    /* renamed from: j, reason: collision with root package name */
    private int f38967j;

    /* renamed from: k, reason: collision with root package name */
    private DialogInterface.OnCancelListener f38968k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f38969l;

    public i(Context context, String str, f fVar, boolean z) {
        super(context, R.style.BottomSheetDialog);
        this.f38964g = 3;
        this.f38967j = -1;
        this.f38958a = str;
        this.f38959b = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f38960c = context;
        this.f38964g = fVar.b(this.f38964g);
        this.f38966i = fVar.f38952e;
        this.f38965h = fVar.f38953f;
        this.f38969l = z;
    }

    public static /* synthetic */ void n(i iVar) {
        DialogInterface.OnCancelListener onCancelListener = iVar.f38968k;
        if (onCancelListener != null) {
            onCancelListener.onCancel(iVar);
        }
    }

    static /* bridge */ /* synthetic */ void o(View view, int i2, String str) {
        TextView textView = (TextView) view.findViewById(i2);
        if (textView == null) {
            return;
        }
        if (str == null) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
    }

    static /* bridge */ /* synthetic */ void p(View view, Drawable drawable) {
        ImageView imageView = (ImageView) view.findViewById(R.id.bottomSheetItemImage);
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Rect rect = new Rect();
            getWindow().getDecorView().getHitRect(rect);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                cancel();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    protected final void j() {
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(window.getAttributes());
        layoutParams.gravity = 80;
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        new ColorMatrixColorFilter(colorMatrix);
        int iR = this.f38960c.getResources().getDisplayMetrics().widthPixels / com.waze.shared_infra.i.h.r(110);
        int iB = this.f38962e.b();
        int i2 = this.f38964g;
        if (i2 <= 1) {
            iB = i2;
        } else if (((iB + iR) - 1) / iR > 1) {
            this.f38964g = iR;
            iB = iR;
        } else {
            this.f38964g = iB;
        }
        if (iB == 1) {
            if (this.f38966i) {
                iB = 1;
            } else {
                iB = 3;
                this.f38964g = 3;
            }
        }
        if (iB >= iR || iB <= 1) {
            layoutParams.width = -1;
        } else {
            layoutParams.width = com.waze.shared_infra.i.h.r(110) * this.f38964g;
        }
        layoutParams.height = -1;
        window.setAttributes(layoutParams);
        setContentView(R.layout.bottom_sheet_cui);
        String str = this.f38958a;
        TextView textView = (TextView) findViewById(R.id.bottomSheetTitle);
        if (textView != null) {
            textView.setText(str);
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < this.f38962e.b(); i3++) {
            e eVar = new e(this);
            eVar.a();
            this.f38962e.c(i3, eVar);
            arrayList.add(eVar);
        }
        this.f38961d = (RecyclerView) findViewById(R.id.bottomSheetGrid);
        h hVar = new h(this, this.f38962e, this.f38964g, arrayList);
        RecyclerView recyclerView = this.f38961d;
        getContext();
        recyclerView.al(new GridLayoutManager(this.f38964g, null));
        this.f38961d.ak(hVar);
        cf cfVar = new cf(getContext(), 1);
        ColorDrawable colorDrawable = new ColorDrawable(ContextCompat.getColor(getContext(), R.color.hairline));
        cfVar.a(colorDrawable);
        this.f38961d.A(cfVar);
        cf cfVar2 = new cf(getContext(), 0);
        cfVar2.a(colorDrawable);
        this.f38961d.A(cfVar2);
        findViewById(R.id.bottomSheetTopSpace).setOnClickListener(new com.waze.profile.m(this, 9));
        findViewById(R.id.bottomSheetGridForeground).setVisibility(8);
        if (this.f38967j >= 0) {
            this.f38961d.post(new a(this));
        }
        View viewFindViewById = findViewById(R.id.cancel_button_container);
        if (this.f38969l) {
            viewFindViewById.setVisibility(0);
            ((TextView) viewFindViewById.findViewById(R.id.bottomSheetItemLabel)).setText(com.waze.shared_infra.o.b.a().c(R.string.ACTION_SHEET_DEFAULT_CANCEL, new Object[0]));
            viewFindViewById.setOnClickListener(new com.waze.profile.m(this, 10));
        }
        Window window2 = getWindow();
        if (window2 != null) {
            com.waze.shared_infra.g.e.f(window2);
            com.waze.shared_infra.g.e.b((ViewGroup) findViewById(R.id.bottomSheetRoot), findViewById(R.id.bottomSheetContentContainer));
            new WindowInsetsControllerCompat(window2, window2.getDecorView()).setAppearanceLightNavigationBars((getContext().getResources().getConfiguration().uiMode & 48) == 16);
        }
    }

    public final void k(b bVar) {
        this.f38962e = bVar;
    }

    public final void l(DialogInterface.OnCancelListener onCancelListener) {
        this.f38968k = onCancelListener;
    }

    public final void m(String str) {
        this.f38958a = str;
    }

    @Override // android.support.v7.app.ap, androidx.activity.ComponentDialog, android.app.Dialog
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j();
        setCanceledOnTouchOutside(true);
        setOnCancelListener(new com.waze.design_components.c.f(this, 8));
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    protected final void onStart() {
        super.onStart();
        com.waze.sharedui.h.k().f(this);
    }

    @Override // android.support.v7.app.ap, androidx.activity.ComponentDialog, android.app.Dialog
    protected final void onStop() {
        super.onStop();
        com.waze.sharedui.h.k().h(this);
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f38963f = motionEvent.getY();
            return false;
        }
        if (motionEvent.getAction() != 2 || motionEvent.getY() - this.f38963f <= com.waze.shared_infra.i.h.r(20)) {
            return false;
        }
        cancel();
        return false;
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        RecyclerView recyclerView = this.f38961d;
        if (recyclerView != null) {
            recyclerView.setVerticalScrollBarEnabled(false);
        }
    }

    @Override // com.waze.sharedui.f
    public final void u() {
        try {
            j();
        } catch (IllegalArgumentException e2) {
            com.waze.shared_infra.i.h.k("BottomSheet", "onOrientationChanged failed with illegal arg exception: ".concat(e2.toString()));
        }
    }

    public i(Context context, String str, f fVar) {
        this(context, str, fVar, false);
    }
}
