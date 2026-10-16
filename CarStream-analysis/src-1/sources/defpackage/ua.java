package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.carstream.tech.R;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public abstract class ua implements s8 {
    public final Context a;
    public r8 b;
    public ImageView c;
    public ImageView d;
    public TextView e;

    public ua(Context context) {
        this.a = context;
    }

    public static String h(long j) {
        if (j < 0) {
            j = 0;
        }
        long j2 = j / 1000;
        long j3 = j2 / 3600;
        long j4 = (j2 % 3600) / 60;
        long j5 = j2 % 60;
        if (j3 <= 0) {
            return j4 + ":" + l(j5);
        }
        return j3 + ":" + l(j4) + ":" + l(j5);
    }

    public static void j(TextView textView, String str) {
        if (textView != null) {
            if (textView.getText().toString().contentEquals(str == null ? "" : str)) {
                return;
            }
            textView.setText(str);
        }
    }

    public static void k(TextView textView, float f, long j) {
        if (textView == null) {
            return;
        }
        if (j <= 0) {
            textView.setVisibility(4);
            return;
        }
        textView.setVisibility(0);
        j(textView, h((long) (f * j)) + " / " + h(j));
    }

    public static String l(long j) {
        return (j < 10 ? "0" : "") + j;
    }

    @Override // defpackage.s8
    public final void c(boolean z) {
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setImageResource(z ? R.drawable.pl_ic_pause : R.drawable.pl_ic_play);
        }
        i(z);
    }

    @Override // defpackage.s8
    public final void d(boolean z) {
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setImageResource(z ? R.drawable.ic_fullscreen_exit : R.drawable.pl_ic_fullscreen);
        }
    }

    @Override // defpackage.s8
    public final void e(String str) {
        if (this.e == null || str == null || str.trim().isEmpty()) {
            return;
        }
        j(this.e, str.trim());
    }

    public final View m(View view, int i, cd cdVar, int i2) {
        bd bdVar;
        View viewFindViewById = view.findViewById(i);
        if (viewFindViewById == null) {
            return null;
        }
        bd[] bdVarArr = cdVar.c;
        int length = bdVarArr.length;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                bdVar = null;
                break;
            }
            bdVar = bdVarArr[i4];
            if (bdVar.a == i2) {
                break;
            }
            i4++;
        }
        if (bdVar == null) {
            bd[] bdVarArr2 = cdVar.d;
            int length2 = bdVarArr2.length;
            while (true) {
                if (i3 >= length2) {
                    bdVar = null;
                    break;
                }
                bd bdVar2 = bdVarArr2[i3];
                if (bdVar2.a == i2) {
                    bdVar = bdVar2;
                    break;
                }
                i3++;
            }
        }
        if (bdVar == null) {
            viewFindViewById.setVisibility(8);
            return null;
        }
        viewFindViewById.setOnClickListener(new ta(this, bdVar, 0));
        if (i2 == 3 && (viewFindViewById instanceof ImageView)) {
            this.c = (ImageView) viewFindViewById;
        }
        if (i2 == 4 && (viewFindViewById instanceof ImageView)) {
            this.d = (ImageView) viewFindViewById;
        }
        return viewFindViewById;
    }

    public final View n(View view, int i, cd cdVar, int i2) {
        bd bdVar;
        View viewFindViewById = view.findViewById(i);
        if (viewFindViewById == null) {
            return null;
        }
        bd[] bdVarArr = cdVar.c;
        int length = bdVarArr.length;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                bdVar = null;
                break;
            }
            bdVar = bdVarArr[i4];
            if (bdVar.a == 5 && bdVar.b == i2) {
                break;
            }
            i4++;
        }
        if (bdVar == null) {
            bd[] bdVarArr2 = cdVar.d;
            int length2 = bdVarArr2.length;
            while (true) {
                if (i3 >= length2) {
                    bdVar = null;
                    break;
                }
                bd bdVar2 = bdVarArr2[i3];
                if (bdVar2.a == 5 && bdVar2.b == i2) {
                    bdVar = bdVar2;
                    break;
                }
                i3++;
            }
        }
        if (bdVar == null) {
            viewFindViewById.setVisibility(8);
            return null;
        }
        viewFindViewById.setOnClickListener(new ta(this, bdVar, 1));
        return viewFindViewById;
    }

    public void i(boolean z) {
    }
}
