package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mgp extends defpackage.mgb implements defpackage.mgd {
    public android.widget.TextView c;
    private android.widget.TextView d;
    private final defpackage.mgu e;

    public mgp() {
        super(2131624481);
        this.e = new defpackage.mgk(this, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mgb
    public final void a(android.view.View view) {
        view.getClass();
        new defpackage.mfz(defpackage.zbe.PREFLIGHT_CAR_INTRO).b(this);
        defpackage.mgr mgrVarA = defpackage.mgr.a();
        android.content.Context contextRequireContext = requireContext();
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(2131429203);
        android.widget.ImageView imageView2 = (android.widget.ImageView) view.findViewById(2131429204);
        android.widget.ImageView imageView3 = (android.widget.ImageView) view.findViewById(2131429205);
        android.widget.ImageView imageView4 = (android.widget.ImageView) view.findViewById(2131429206);
        imageView.setImageDrawable(new android.graphics.drawable.BitmapDrawable(contextRequireContext.getResources(), defpackage.lfy.e(contextRequireContext).a(contextRequireContext, 2131232081)));
        imageView2.setImageDrawable(new android.graphics.drawable.BitmapDrawable(contextRequireContext.getResources(), defpackage.lfy.e(contextRequireContext).b(contextRequireContext, defpackage.mkt.b)));
        defpackage.lel lelVar = defpackage.lem.a;
        lelVar.a();
        imageView3.setImageDrawable(new android.graphics.drawable.BitmapDrawable(contextRequireContext.getResources(), defpackage.lfy.e(contextRequireContext).a(contextRequireContext, 2131232670)));
        java.lang.String defaultSmsPackage = android.provider.Telephony.Sms.getDefaultSmsPackage(contextRequireContext);
        imageView4.setImageDrawable(defaultSmsPackage != null ? new android.graphics.drawable.BitmapDrawable(contextRequireContext.getResources(), defpackage.lfy.e(contextRequireContext).b(contextRequireContext, new android.content.ComponentName(defaultSmsPackage, ""))) : new android.graphics.drawable.BitmapDrawable(contextRequireContext.getResources(), defpackage.lfy.e(contextRequireContext).a(contextRequireContext, 2131232089)));
        defpackage.ygw ygwVarT = defpackage.ygw.t(imageView, imageView2, imageView3, imageView4);
        int i = ((defpackage.ymx) ygwVarT).c;
        for (int i2 = 0; i2 < i; i2++) {
            android.widget.ImageView imageView5 = (android.widget.ImageView) ygwVarT.get(i2);
            lelVar.a();
            int dimensionPixelSize = contextRequireContext.getResources().getDimensionPixelSize(2131168129);
            android.graphics.Path pathA = defpackage.lfx.a.a().a(dimensionPixelSize);
            float f = dimensionPixelSize;
            android.graphics.drawable.ShapeDrawable shapeDrawable = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.PathShape(pathA, f, f));
            android.graphics.Paint paint = shapeDrawable.getPaint();
            paint.setColor(mgrVarA.a);
            paint.setStyle(android.graphics.Paint.Style.FILL);
            paint.setAntiAlias(true);
            imageView5.setBackground(shapeDrawable);
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(2131429220);
        this.d = textView;
        if (textView != null) {
            textView.setText(2132084828);
        }
        this.c = (android.widget.TextView) view.findViewById(2131429209);
        java.lang.String string = android.provider.Settings.Global.getString(requireContext().getContentResolver(), "device_name");
        if (string == null || string.length() == 0) {
            string = android.os.Build.MODEL;
        }
        android.widget.TextView textView2 = this.c;
        if (textView2 != null) {
            textView2.setText(requireContext().getString(2132084832, string));
        }
        com.google.android.apps.auto.components.ui.widget.Button buttonFindViewById = view.findViewById(2131429511);
        if (buttonFindViewById != null) {
            java.lang.String string2 = requireContext().getString(2132084831);
            string2.getClass();
            if (buttonFindViewById instanceof com.google.android.apps.auto.components.coolwalk.compose.viewcompat.CarButton) {
                com.google.android.apps.auto.components.coolwalk.compose.viewcompat.CarButton carButton = (com.google.android.apps.auto.components.coolwalk.compose.viewcompat.CarButton) buttonFindViewById;
                carButton.a(string2);
                carButton.k(defpackage.kwh.Colored);
                defpackage.ksi.a.a().e.eM(this, new defpackage.kku(new defpackage.lto(buttonFindViewById, 4), 4));
            } else if (buttonFindViewById instanceof com.google.android.apps.auto.components.ui.widget.Button) {
                buttonFindViewById.b(string2);
                defpackage.ksi.a.a().e.eM(this, new defpackage.kku(new defpackage.mda(buttonFindViewById, 6), 4));
            }
            buttonFindViewById.setOnClickListener(new defpackage.mgn());
        }
    }

    @Override // defpackage.mgd
    public final android.widget.TextView b() {
        return this.c;
    }

    @Override // defpackage.mgd
    public final android.widget.TextView c() {
        return this.d;
    }

    @Override // android.support.v4.app.Fragment
    public final void onAttach(android.content.Context context) {
        context.getClass();
        super.onAttach(context);
        defpackage.tez.c(this, defpackage.mgo.class);
    }

    @Override // android.support.v4.app.Fragment
    public final void onStart() {
        super.onStart();
        ((defpackage.mfx) ((defpackage.mfu) defpackage.mkp.a.i(defpackage.mfu.class)).a()).b.b(this.e);
    }

    @Override // android.support.v4.app.Fragment
    public final void onStop() {
        ((defpackage.mfx) defpackage.luq.b().a()).b.c(this.e);
        super.onStop();
    }
}
