package defpackage;

import android.R;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.Fragment;
import android.view.View;
import com.google.android.apps.auto.components.preflight.phone.PreflightPhonePermissionsActivity;
import com.google.android.apps.auto.components.preflight.phone.PreflightPhoneWelcomeActivity;
import com.google.android.projection.gearhead.companion.AndroidAutoActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class mga implements View.OnClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mga(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [eqa, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                mge mgeVar = (mge) this.a;
                mhf mhfVar = mgeVar.b;
                if (mhfVar != null) {
                    mgeVar.e(mhfVar.b(), false);
                    break;
                } else {
                    ((mfp) luk.b().a()).b.a(mgl.d);
                    break;
                }
            case 1:
                ((ype) ((ype) mge.a.f()).ai((char) 4880)).u("exit button clicked");
                mge mgeVar2 = (mge) this.a;
                mhf mhfVar2 = mgeVar2.b;
                if (mhfVar2 != null && mhfVar2.a() != 2) {
                    mgeVar2.e(new mgi(), true);
                    break;
                } else {
                    mfl mflVarA = luk.b().a();
                    ((mfp) mflVarA).b.a(mgl.d);
                    break;
                }
                break;
            case 2:
                if (((mfp) ((mfm) mki.a.i(mfm.class)).a()).c != null) {
                    ?? r4 = this.a;
                    mgo mgoVar = (mgo) r4;
                    mgoVar.h = true;
                    mgoVar.j.getClass();
                    if (mdh.h() && !mgo.h()) {
                        mgr mgrVar = (mgr) r4;
                        bc bcVar = mgrVar.k;
                        if (bcVar instanceof PreflightPhoneWelcomeActivity) {
                            PreflightPhoneWelcomeActivity preflightPhoneWelcomeActivity = (PreflightPhoneWelcomeActivity) bcVar;
                            preflightPhoneWelcomeActivity.r = new mhd(preflightPhoneWelcomeActivity);
                            if (Build.VERSION.SDK_INT >= 33) {
                                preflightPhoneWelcomeActivity.registerReceiver(preflightPhoneWelcomeActivity.r, preflightPhoneWelcomeActivity.o, 2);
                            } else {
                                preflightPhoneWelcomeActivity.registerReceiver(preflightPhoneWelcomeActivity.r, preflightPhoneWelcomeActivity.o);
                            }
                            preflightPhoneWelcomeActivity.p.removeCallbacks(preflightPhoneWelcomeActivity.s);
                            mgrVar.i();
                            break;
                        }
                    } else {
                        mdh.f(r4);
                        break;
                    }
                } else {
                    ((ype) ((ype) mgo.g.h()).ai((char) 4893)).u("Cannot progress through FRX because session has ended");
                    break;
                }
                break;
            case 3:
                Object obj = this.a;
                Fragment fragment = (Fragment) obj;
                fragment.requireContext().startActivity(new Intent(fragment.requireContext(), (Class<?>) PreflightPhonePermissionsActivity.class).setFlags(268435456), luk.c());
                ((mgo) obj).i.a(yzy.bJ);
                break;
            case 4:
                Object obj2 = this.a;
                ((mgr) obj2).i();
                ((mfp) luk.b().a()).b.a(mgl.d);
                ((ao) obj2).c();
                break;
            case 5:
                wme wmeVar = (wme) this.a;
                if (wmeVar.c && wmeVar.isShowing()) {
                    if (!wmeVar.e) {
                        TypedArray typedArrayObtainStyledAttributes = wmeVar.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                        wmeVar.d = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                        wmeVar.e = true;
                    }
                    if (wmeVar.d) {
                        wmeVar.cancel();
                        break;
                    }
                }
                break;
            case 6:
                ((AndroidAutoActivity) this.a).startActivity(new Intent("android.intent.action.VIEW", Uri.parse(aclr.c())));
                break;
            default:
                ((AndroidAutoActivity) this.a).startActivity(new Intent("android.intent.action.VIEW", Uri.parse(aclr.e())));
                break;
        }
    }

    public mga(wme wmeVar, int i) {
        this.b = i;
        this.a = wmeVar;
    }
}
