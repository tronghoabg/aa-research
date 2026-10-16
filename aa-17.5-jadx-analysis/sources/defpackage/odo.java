package defpackage;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.telecom.CallAudioState;
import com.google.android.apps.auto.components.telecom.call.CarCall;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public interface odo extends lhg {
    public static final CallAudioState a = new CallAudioState(false, 1, 1);

    Collection A(Context context);

    boolean B(Context context);

    boolean C(odm odmVar, odm odmVar2);

    boolean D(CarCall carCall);

    boolean E();

    boolean F(int i);

    boolean G(CarCall carCall);

    boolean H(Context context);

    boolean I(int i);

    boolean J(CarCall carCall);

    boolean K(odm odmVar, odm odmVar2);

    boolean L(Context context);

    boolean M(Context context, String str);

    boolean N(odm odmVar, odm odmVar2);

    boolean O(odm odmVar, odm odmVar2);

    int P(ContentResolver contentResolver, String str);

    List Q(ContentResolver contentResolver, String str);

    boolean R();

    void S(Context context, ComponentName componentName);

    Bitmap a(ContentResolver contentResolver, String str);

    Uri b(Context context, CarCall carCall);

    CarCall e(int i);

    CarCall f(int... iArr);

    CarCall g();

    CarCall h();

    rrb i(int i, yzz yzzVar, yzy yzyVar);

    rrb j(CarCall carCall, yzz yzzVar, yzy yzyVar);

    rrb k(yzz yzzVar, yzy yzyVar);

    CharSequence l(Context context, CarCall carCall);

    CharSequence m(Context context, String str);

    String n(ContentResolver contentResolver, String str);

    String o(Context context);

    String p(Context context, CarCall carCall);

    String q(Context context, String str);

    String r(Context context, String str);

    String s(Context context, ComponentName componentName, int i);

    String t(Context context, long j, String str);

    String u(CarCall carCall);

    String v(Context context, long j, String str);

    String w(Context context, int i, String str);

    String x(Context context, long j, String str, String str2);

    String y(Context context, long j);

    String z(Context context, int i, String str);
}
