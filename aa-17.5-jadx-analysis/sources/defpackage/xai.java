package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.PathShape;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.projection.gearhead.R;
import com.google.android.projection.gearhead.companion.settings.AddAssistantShortcutActivity;
import com.google.android.projection.gearhead.companion.settings.LauncherAppSettingsActivity;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class xai extends lt implements oxi {
    static boolean a = false;
    public final List e;
    public final List f;
    public final List g;
    public final LauncherAppSettingsActivity h;
    public final nv i;
    public RecyclerView j;
    public xag k;
    public xah l;
    public xad m;

    public xai(LauncherAppSettingsActivity launcherAppSettingsActivity, nv nvVar) {
        a = false;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = launcherAppSettingsActivity;
        this.i = nvVar;
    }

    public static int c() {
        return acsi.e() ? 2 : 1;
    }

    public static void t(View view) {
        if (a) {
            return;
        }
        Snackbar.k(view, R.string.settings_customize_app_launcher_change_message).f();
        a = true;
    }

    @Override // defpackage.lt
    public final int a() {
        return this.e.size();
    }

    @Override // defpackage.lt
    public final int d(int i) {
        Object obj = this.e.get(i);
        if (obj instanceof mrl) {
            return 4;
        }
        if (obj instanceof mqz) {
            return 1;
        }
        if (obj instanceof xag) {
            return 2;
        }
        if (obj instanceof xah) {
            return 3;
        }
        if (obj instanceof xad) {
            return 5;
        }
        throw new IllegalStateException(a.bp(i, "Unknown item type at position: "));
    }

    @Override // defpackage.lt
    public final mo f(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new wzx(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.material3_launcher_settings_apps_row, viewGroup, false));
        }
        if (i == 2) {
            return new mo(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.launcher_settings_divider_row, viewGroup, false));
        }
        if (i == 3) {
            return new xbq(this, this.h, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.material3_launcher_settings_radio_button_row, viewGroup, false));
        }
        if (i == 4) {
            return new xbr(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.material3_launcher_settings_shortcut_row, viewGroup, false));
        }
        if (i == 5) {
            return new xaf(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.material3_launcher_settings_add_shortcut_row, viewGroup, false));
        }
        throw new IllegalArgumentException(a.bp(i, "Unknown view type: "));
    }

    @Override // defpackage.lt
    public final void m(RecyclerView recyclerView) {
        this.j = recyclerView;
    }

    @Override // defpackage.lt
    public final void n(mo moVar, int i) throws Resources.NotFoundException {
        byte[] bArr = null;
        if (!(moVar instanceof wzy)) {
            if (moVar instanceof xbq) {
                xbq xbqVar = (xbq) moVar;
                View view = xbqVar.a;
                view.setVisibility(0);
                view.setOnClickListener(new xao(xbqVar, 3, bArr));
                xbqVar.E();
                return;
            }
            return;
        }
        mqz mqzVar = (mqz) this.e.get(i);
        wzy wzyVar = (wzy) moVar;
        wzyVar.w = mqzVar;
        wzyVar.v.setText(mqzVar.i());
        View view2 = wzyVar.u;
        TextView textView = (TextView) view2.findViewById(R.id.label);
        ImageView imageView = (ImageView) view2.findViewById(R.id.icon);
        MaterialCardView materialCardView = (MaterialCardView) view2.findViewById(R.id.icon_circular_crop_container);
        ImageView imageView2 = (ImageView) view2.findViewById(R.id.badge_background);
        ImageView imageView3 = (ImageView) view2.findViewById(R.id.badge);
        wmo wmoVar = materialCardView.g;
        if (wmoVar.j != 0) {
            wmoVar.j = 0;
            wmoVar.j();
        }
        materialCardView.invalidate();
        materialCardView.h();
        materialCardView.fB(0);
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(0);
        if (wmoVar.p != colorStateListValueOf) {
            wmoVar.p = colorStateListValueOf;
            wmoVar.j();
        }
        materialCardView.invalidate();
        int dimensionPixelSize = imageView.getContext().getResources().getDimensionPixelSize(R.dimen.launcher_app_settings_icon_diameter);
        float f = dimensionPixelSize;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new PathShape(lfr.b().a(dimensionPixelSize), f, f));
        int dimensionPixelSize2 = imageView.getContext().getResources().getDimensionPixelSize(R.dimen.launcher_app_settings_icon_outline_width);
        Paint paint = shapeDrawable.getPaint();
        paint.setColor(imageView.getContext().getResources().getColor(R.color.launcher_app_settings_outline, null));
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(dimensionPixelSize2);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{mqzVar.g(imageView.getContext(), dimensionPixelSize), shapeDrawable});
        layerDrawable.setLayerInsetRelative(1, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
        imageView.setImageDrawable(layerDrawable);
        GhIcon ghIcon = mqzVar.f;
        if (ghIcon != null) {
            imageView3.setImageDrawable(ghIcon.f(imageView3.getContext(), -1));
            imageView2.setImageResource(R.drawable.launcher_badge_background_settings);
        } else {
            imageView3.setImageDrawable(null);
            imageView2.setImageDrawable(null);
        }
        textView.setText(mqzVar.i());
        view2.setVisibility(0);
        view2.setOnClickListener(null);
        view2.setContentDescription(mqzVar.i());
        wzyVar.z.setContentDescription(mki.a.c.getString(R.string.settings_customize_drag_affordance_content_description, mqzVar.i()));
        wzyVar.x.setOnClickListener(new wwt(wzyVar, 18));
        view2.setOnClickListener(new wwt(wzyVar, 19));
        wzyVar.E();
        wzyVar.I(wzyVar.H());
    }

    @Override // defpackage.lt
    public final void o(mo moVar) {
        if (!(moVar instanceof wzy)) {
            if (moVar instanceof xbq) {
                ((xbq) moVar).a.setOnClickListener(null);
            }
        } else {
            wzy wzyVar = (wzy) moVar;
            wzyVar.x.setOnClickListener(null);
            wzyVar.u.setOnClickListener(null);
            wzyVar.z.setOnTouchListener(null);
            wzyVar.G();
        }
    }

    public final void s() {
        nrz nrzVarE = nrz.e();
        Stream map = Collection.EL.stream(this.f).map(new uzr(17));
        int i = yfq.d;
        List list = (List) map.collect(ycm.a);
        SharedPreferences.Editor editorEdit = nrzVarE.i.edit();
        editorEdit.clear();
        for (int i2 = 0; i2 < list.size(); i2++) {
            editorEdit.putInt(((ComponentName) list.get(i2)).flattenToString(), i2);
        }
        editorEdit.commit();
    }

    final void u(Bundle bundle) {
        LauncherAppSettingsActivity launcherAppSettingsActivity = this.h;
        Intent intent = new Intent(launcherAppSettingsActivity, (Class<?>) AddAssistantShortcutActivity.class);
        if (bundle != null) {
            intent.putExtra("PAYLOAD", bundle);
        }
        launcherAppSettingsActivity.startActivityForResult(intent, 1002);
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.LAUNCHER_SHORTCUT, bundle == null ? yzy.uJ : yzy.uK).l());
    }

    public final void v() {
        List list = this.e;
        list.clear();
        if (acsi.e()) {
            list.add(this.m);
        }
        list.add(this.l);
        list.addAll(this.f);
        List list2 = this.g;
        if (list2.isEmpty()) {
            return;
        }
        list.add(this.k);
        list.addAll(list2);
    }

    public final boolean w(int i) {
        List list = this.g;
        int size = list.isEmpty() ? 0 : list.size() + 1;
        List list2 = this.e;
        List list3 = this.f;
        int iC = c();
        woy.O(list2.size() == (list3.size() + iC) + size, "There is an issue with the recyclerView size");
        int i2 = i - iC;
        return i2 >= 0 && i2 < list3.size();
    }

    @Override // defpackage.oxi
    public final void b(int i) {
    }
}
