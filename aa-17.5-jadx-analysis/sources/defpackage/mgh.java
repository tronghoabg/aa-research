package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.PathShape;
import android.os.Build;
import android.provider.Settings;
import android.provider.Telephony;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.auto.components.coolwalk.compose.viewcompat.CarButton;
import com.google.android.apps.auto.components.ui.widget.Button;
import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public final class mgh extends mft implements mfv {
    public TextView c;
    private TextView d;
    private final mgm e;

    public mgh() {
        super(R.layout.preflight_car_intro);
        this.e = new mgc(this, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mft
    public final void a(View view) throws Resources.NotFoundException {
        view.getClass();
        new mfr(yzz.PREFLIGHT_CAR_INTRO).b(this);
        mgj mgjVarA = mgj.a();
        Context contextRequireContext = requireContext();
        ImageView imageView = (ImageView) view.findViewById(R.id.preflight_apps_image_0);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.preflight_apps_image_1);
        ImageView imageView3 = (ImageView) view.findViewById(R.id.preflight_apps_image_2);
        ImageView imageView4 = (ImageView) view.findViewById(R.id.preflight_apps_image_3);
        imageView.setImageDrawable(new BitmapDrawable(contextRequireContext.getResources(), lfs.e(contextRequireContext).a(contextRequireContext, R.drawable.ic_maps_56x56)));
        imageView2.setImageDrawable(new BitmapDrawable(contextRequireContext.getResources(), lfs.e(contextRequireContext).b(contextRequireContext, mkn.b)));
        leg legVar = leh.a;
        legVar.a();
        imageView3.setImageDrawable(new BitmapDrawable(contextRequireContext.getResources(), lfs.e(contextRequireContext).a(contextRequireContext, R.drawable.ic_spotify_56x56)));
        String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(contextRequireContext);
        imageView4.setImageDrawable(defaultSmsPackage != null ? new BitmapDrawable(contextRequireContext.getResources(), lfs.e(contextRequireContext).b(contextRequireContext, new ComponentName(defaultSmsPackage, ""))) : new BitmapDrawable(contextRequireContext.getResources(), lfs.e(contextRequireContext).a(contextRequireContext, R.drawable.ic_messages_56x56)));
        yfq yfqVarT = yfq.t(imageView, imageView2, imageView3, imageView4);
        int i = ((yls) yfqVarT).c;
        for (int i2 = 0; i2 < i; i2++) {
            ImageView imageView5 = (ImageView) yfqVarT.get(i2);
            legVar.a();
            int dimensionPixelSize = contextRequireContext.getResources().getDimensionPixelSize(R.dimen.preflight_app_icons_size_gm3);
            Path pathA = lfr.a.a().a(dimensionPixelSize);
            float f = dimensionPixelSize;
            ShapeDrawable shapeDrawable = new ShapeDrawable(new PathShape(pathA, f, f));
            Paint paint = shapeDrawable.getPaint();
            paint.setColor(mgjVarA.a);
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            imageView5.setBackground(shapeDrawable);
        }
        TextView textView = (TextView) view.findViewById(R.id.preflight_title);
        this.d = textView;
        if (textView != null) {
            textView.setText(R.string.preflight_intro_check_device);
        }
        this.c = (TextView) view.findViewById(R.id.preflight_body);
        String string = Settings.Global.getString(requireContext().getContentResolver(), "device_name");
        if (string == null || string.length() == 0) {
            string = Build.MODEL;
        }
        TextView textView2 = this.c;
        if (textView2 != null) {
            textView2.setText(requireContext().getString(R.string.preflight_intro_phone_info, string));
        }
        View viewFindViewById = view.findViewById(R.id.show_authorization_dialog_button);
        if (viewFindViewById != null) {
            String string2 = requireContext().getString(R.string.preflight_intro_finish_setup_on_phone);
            string2.getClass();
            if (viewFindViewById instanceof CarButton) {
                CarButton carButton = (CarButton) viewFindViewById;
                carButton.a(string2);
                carButton.k(kwb.e);
                ksa.a.a().e.fE(this, new kko(new ltd(viewFindViewById, 5), 4));
            } else if (viewFindViewById instanceof Button) {
                ((Button) viewFindViewById).b(string2);
                ksa.a.a().e.fE(this, new kko(new mcm(viewFindViewById, 10), 4));
            }
            viewFindViewById.setOnClickListener(new mgf());
        }
    }

    @Override // defpackage.mfv
    public final TextView b() {
        return this.c;
    }

    @Override // defpackage.mfv
    public final TextView c() {
        return this.d;
    }

    @Override // android.support.v4.app.Fragment
    public final void onAttach(Context context) throws AssertionError {
        context.getClass();
        super.onAttach(context);
        tec.c(this, mgg.class);
    }

    @Override // android.support.v4.app.Fragment
    public final void onStart() {
        super.onStart();
        ((mfp) ((mfm) mki.a.i(mfm.class)).a()).b.b(this.e);
    }

    @Override // android.support.v4.app.Fragment
    public final void onStop() {
        ((mfp) ((mfm) mki.a.i(mfm.class)).a()).b.c(this.e);
        super.onStop();
    }
}
