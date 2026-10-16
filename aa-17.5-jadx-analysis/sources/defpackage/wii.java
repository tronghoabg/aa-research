package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;

/* loaded from: classes3.dex */
public abstract class wii extends Fragment {
    public abyt a;
    protected abxu b;
    protected Integer c;

    static Bundle a(abyt abytVar, Integer num, int i) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("Question", abytVar.h());
        if (num != null) {
            bundle.putInt("DisplayLogoResId", num.intValue());
        }
        bundle.putInt("QuestionIndex", i);
        return bundle;
    }

    protected final wjy b() {
        wjy wjyVar;
        Activity activityB;
        Object context = getContext();
        eqa parentFragment = getParentFragment();
        if (parentFragment instanceof wjy) {
            return (wjy) parentFragment;
        }
        if (!(context instanceof wjy) || (activityB = (wjyVar = (wjy) context).b()) == null || activityB.isFinishing() || activityB.isDestroyed()) {
            return null;
        }
        return wjyVar;
    }

    public abstract abye c();

    public abstract void e();

    public abstract void f(String str);

    @Override // android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        Bundle arguments = getArguments();
        byte[] byteArray = arguments.getByteArray("Question");
        if (byteArray != null) {
            this.a = (abyt) wid.c(abyt.a, byteArray);
        }
        this.c = arguments.containsKey("DisplayLogoResId") ? Integer.valueOf(arguments.getInt("DisplayLogoResId", 0)) : null;
        arguments.getInt("QuestionIndex");
        byte[] byteArray2 = arguments.getByteArray("Completion");
        if (byteArray2 != null) {
            this.b = (abxu) wid.c(abxu.b, byteArray2);
        }
    }

    public void d() {
    }
}
