package j;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* renamed from: j.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3068e {

    /* renamed from: a, reason: collision with root package name */
    public final C3065b f38456a;

    /* renamed from: b, reason: collision with root package name */
    public final int f38457b;

    public C3068e(Context context) {
        this(context, DialogInterfaceC3069f.e(context, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    public DialogInterfaceC3069f create() {
        C3065b c3065b = this.f38456a;
        DialogInterfaceC3069f dialogInterfaceC3069f = new DialogInterfaceC3069f(c3065b.f38412a, this.f38457b);
        View view = c3065b.f38416e;
        C3067d c3067d = dialogInterfaceC3069f.f38460f;
        if (view != null) {
            c3067d.f38451v = view;
        } else {
            CharSequence charSequence = c3065b.f38415d;
            if (charSequence != null) {
                c3067d.f38434d = charSequence;
                TextView textView = c3067d.f38449t;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c3065b.f38414c;
            if (drawable != null) {
                c3067d.f38447r = drawable;
                ImageView imageView = c3067d.f38448s;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c3067d.f38448s.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = c3065b.f38417f;
        if (charSequence2 != null) {
            c3067d.c(-1, charSequence2, c3065b.f38418g);
        }
        CharSequence charSequence3 = c3065b.f38419h;
        if (charSequence3 != null) {
            c3067d.c(-2, charSequence3, c3065b.f38420i);
        }
        if (c3065b.k != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c3065b.f38413b.inflate(c3067d.f38455z, (ViewGroup) null);
            int i5 = c3065b.f38424n ? c3067d.f38426A : c3067d.f38427B;
            Object obj = c3065b.k;
            ?? c3066c = obj;
            if (obj == null) {
                c3066c = new C3066c(c3065b.f38412a, i5, R.id.text1, null);
            }
            c3067d.f38452w = c3066c;
            c3067d.f38453x = c3065b.f38425o;
            if (c3065b.f38422l != null) {
                alertController$RecycleListView.setOnItemClickListener(new C3064a(c3065b, c3067d));
            }
            if (c3065b.f38424n) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c3067d.f38435e = alertController$RecycleListView;
        }
        View view2 = c3065b.f38423m;
        if (view2 != null) {
            c3067d.f38436f = view2;
            c3067d.f38437g = false;
        }
        dialogInterfaceC3069f.setCancelable(true);
        dialogInterfaceC3069f.setCanceledOnTouchOutside(true);
        dialogInterfaceC3069f.setOnCancelListener(null);
        dialogInterfaceC3069f.setOnDismissListener(null);
        p.l lVar = c3065b.f38421j;
        if (lVar != null) {
            dialogInterfaceC3069f.setOnKeyListener(lVar);
        }
        return dialogInterfaceC3069f;
    }

    public Context getContext() {
        return this.f38456a.f38412a;
    }

    public C3068e setNegativeButton(int i5, DialogInterface.OnClickListener onClickListener) {
        C3065b c3065b = this.f38456a;
        c3065b.f38419h = c3065b.f38412a.getText(i5);
        c3065b.f38420i = onClickListener;
        return this;
    }

    public C3068e setPositiveButton(int i5, DialogInterface.OnClickListener onClickListener) {
        C3065b c3065b = this.f38456a;
        c3065b.f38417f = c3065b.f38412a.getText(i5);
        c3065b.f38418g = onClickListener;
        return this;
    }

    public C3068e setTitle(CharSequence charSequence) {
        this.f38456a.f38415d = charSequence;
        return this;
    }

    public C3068e setView(View view) {
        this.f38456a.f38423m = view;
        return this;
    }

    public C3068e(Context context, int i5) {
        this.f38456a = new C3065b(new ContextThemeWrapper(context, DialogInterfaceC3069f.e(context, i5)));
        this.f38457b = i5;
    }
}
