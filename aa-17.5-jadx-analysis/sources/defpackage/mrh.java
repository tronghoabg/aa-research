package defpackage;

import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* loaded from: classes2.dex */
public final /* synthetic */ class mrh implements Function {
    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo329andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        GhIcon ghIcon;
        mrg mrgVar = (mrg) obj;
        try {
            int iOrdinal = mrf.a(mrgVar.c).ordinal();
            boolean z = false;
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    ((ype) ((ype) mrm.a.g()).ai(5225)).y("unknown shortcut type: %s", mrf.a(mrgVar.c));
                    return null;
                }
                int i = mrb.a;
                woy.aa(mrf.a(mrgVar.c) == mrf.ASSISTANT_SHORTCUT_RECORD, "invalid type");
                woy.aa(1 == ((mrgVar.c == 4 ? (mrc) mrgVar.d : mrc.a).b & 1), "assistant shortcut missing query");
                if (1 == (mrgVar.b & 1)) {
                    z = true;
                }
                woy.aa(z, "assistant shortcut missing label");
                return new mrb(mrgVar, mrgVar.e, (mrgVar.c == 4 ? (mrc) mrgVar.d : mrc.a).c, new GhIcon(8));
            }
            int i2 = mrd.g;
            woy.aa(mrf.a(mrgVar.c) == mrf.CALL_SHORTCUT_RECORD, "invalid type");
            if (1 == ((mrgVar.c == 3 ? (mre) mrgVar.d : mre.a).b & 1)) {
                z = true;
            }
            woy.aa(z, "call shortcut must contain a contact uri");
            Cursor cursorQuery = mki.a.c.getApplicationContext().getContentResolver().query(Uri.parse((mrgVar.c == 3 ? (mre) mrgVar.d : mre.a).c), mrd.a, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndex("data1"));
                        String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("display_name"));
                        String string3 = cursorQuery.getString(cursorQuery.getColumnIndex("photo_thumb_uri"));
                        if (TextUtils.isEmpty(string3)) {
                            ghIcon = new GhIcon(8);
                        } else {
                            if (string3 == null) {
                                throw new IllegalArgumentException("Uri must not be null.");
                            }
                            GhIcon ghIcon2 = new GhIcon(4);
                            ghIcon2.f = string3;
                            ghIcon = ghIcon2;
                        }
                        String string4 = ContactsContract.CommonDataKinds.Phone.getTypeLabel(mki.a.c.getResources(), cursorQuery.getInt(cursorQuery.getColumnIndex("data2")), cursorQuery.getString(cursorQuery.getColumnIndex("data3"))).toString();
                        cursorQuery.close();
                        if (TextUtils.isEmpty(string)) {
                            throw new IllegalStateException("contact number not found");
                        }
                        return new mrd(mrgVar, string2, string, ghIcon, string4);
                    }
                } finally {
                }
            }
            throw new IllegalStateException("contact not found");
        } catch (RuntimeException e) {
            ((ype) ((ype) ((ype) mrm.a.g()).p(e)).ai((char) 5226)).u("unable to create shortcut from LauncherShortcutRecord");
            ohs ohsVarJ = ebf.j();
            rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.LAUNCHER_SHORTCUT, yzy.uY);
            rrbVarH.A(mrf.a(mrgVar.c).d);
            ohsVarJ.F(rrbVarH.l());
            return null;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
