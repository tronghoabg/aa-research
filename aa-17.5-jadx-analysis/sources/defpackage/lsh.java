package defpackage;

import android.content.res.ColorStateList;
import android.support.v4.app.Fragment;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.car.app.model.Action;
import androidx.car.app.model.ItemList;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import com.google.android.apps.auto.components.settings.connectacar.ConnectACarActivity;
import com.google.android.apps.auto.components.settings.troubleshooter.TroubleshooterActivity;
import com.google.android.projection.gearhead.R;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class lsh implements eqn {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ lsh(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eqn
    public final void eS(Object obj) {
        int i = 10;
        int i2 = 3;
        int i3 = 0;
        int i4 = 1;
        switch (this.b) {
            case 0:
                lsi lsiVar = (lsi) obj;
                ((lsj) this.a).a.add(new lsk(lsiVar.a, (lmd) lsiVar.b.orElse(null)));
                return;
            case 1:
                lsi lsiVar2 = (lsi) obj;
                ((lsj) this.a).a.add(new lsl(lsiVar2.a, (AaPlaybackState) lsiVar2.b.orElse(null)));
                return;
            case 2:
                List list = (List) obj;
                Object obj2 = this.a;
                yph yphVar = lvq.a;
                if (!list.isEmpty()) {
                    ((lwz) obj2).p(lwr.b(list, actj.b(), (int) actj.d()));
                    yph yphVar2 = lvq.a;
                    if (yphVar2.l().Z()) {
                        ((ype) yphVar2.l().ai((char) 4321)).y("Added Smart Actions: %s", Objects.toString(obj2));
                    }
                }
                lvq.f((lwz) obj2);
                return;
            case 3:
                Object obj3 = this.a;
                lyg lygVar = (lyg) obj3;
                Action action = lygVar.b;
                yfq yfqVar = (yfq) obj;
                tlm tlmVar = (tlm) obj3;
                uj ujVarR = szp.r(tlmVar.e);
                if (action != null) {
                    ujVarR.b(action);
                }
                ug ugVar = new ug();
                ugVar.c(lygVar.a.getString(R.string.no_messages_notification_backend));
                int size = yfqVar.size();
                while (i3 < size) {
                    lug lugVar = (lug) yfqVar.get(i3);
                    if (!lugVar.d.isEmpty()) {
                        ugVar.b(jxt.a(lygVar.c, lugVar));
                    }
                    i3++;
                }
                ItemList itemListA = ugVar.a();
                ujVarR.f(itemListA);
                int size2 = itemListA.getItems().size();
                if (!lygVar.d) {
                    ohs ohsVarJ = ebf.j();
                    rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.MESSAGING_APP, yzy.mW);
                    rrbVarH.z(size2);
                    ohsVarJ.F(rrbVarH.l());
                    lygVar.d = true;
                }
                tlmVar.g.d(ujVarR.a());
                return;
            case 4:
                ((mca) this.a).f(((Boolean) obj).booleanValue());
                return;
            case 5:
                yph yphVar3 = mgi.a;
                ImageView imageView = (ImageView) this.a;
                imageView.setImageTintList(ColorStateList.valueOf(krr.s.b(imageView.getContext(), (krz) obj)));
                return;
            case 6:
                ImageView imageView2 = (ImageView) this.a;
                imageView2.setImageTintList(ColorStateList.valueOf(krr.s.b(imageView2.getContext(), (krz) obj)));
                return;
            case 7:
                int iIntValue = ((Integer) obj).intValue();
                Object obj4 = this.a;
                mgp mgpVar = (mgp) obj4;
                ((TextView) mgpVar.g.findViewById(R.id.dialog_title)).setText(R.string.preflight_error_title_generic);
                if (iIntValue == 2) {
                    ((TextView) mgpVar.g.findViewById(R.id.dialog_body)).setText(R.string.preflight_error_body_wireless_generic);
                    ((ImageView) mgpVar.g.findViewById(R.id.dialog_illustration)).setImageDrawable(((Fragment) obj4).requireContext().getDrawable(R.drawable.phone_frx_wireless_disconnect));
                    return;
                } else {
                    ((TextView) mgpVar.g.findViewById(R.id.dialog_body)).setText(R.string.preflight_error_body_usb);
                    ((ImageView) mgpVar.g.findViewById(R.id.dialog_illustration)).setImageDrawable(((Fragment) obj4).requireContext().getDrawable(R.drawable.phone_frx_usb_disconnect));
                    return;
                }
            case 8:
                ((min) this.a).c = (yfy) obj;
                return;
            case 9:
                ((min) this.a).e = (yfy) obj;
                return;
            case 10:
                ((min) this.a).d = (yfy) obj;
                return;
            case 11:
                Iterable$EL.forEach((ygr) obj, new kok(this.a, 11));
                return;
            case 12:
                MediaSessionCompat mediaSessionCompat = ((mjm) this.a).b;
                PlaybackStateCompat playbackStateCompat = (PlaybackStateCompat) obj;
                mediaSessionCompat.i(playbackStateCompat);
                mediaSessionCompat.e(playbackStateCompat.a != 0);
                return;
            case 13:
                if (((Boolean) obj).booleanValue()) {
                    MediaSessionCompat mediaSessionCompat2 = ((mjm) this.a).b;
                    if (mediaSessionCompat2.a.a() == null) {
                        kmu kmuVar = new kmu();
                        kmuVar.h("android.media.metadata.DISPLAY_ICON_URI", mit.a(0, "station_icon_fallback_play").toString());
                        MediaMetadataCompat mediaMetadataCompatE = kmuVar.e();
                        ((ype) ((ype) mjm.a.e()).ai((char) 5038)).u("Radio has a valid state, but not metadata, setting at least a default radio icon.");
                        mediaSessionCompat2.h(mediaMetadataCompatE);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                int iOrdinal = ((mjh) obj).ordinal();
                Object obj5 = this.a;
                if (iOrdinal == 0) {
                    ((mjm) obj5).b.e(true);
                    return;
                } else {
                    if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                        ((mjm) obj5).b.e(false);
                        return;
                    }
                    return;
                }
            case 15:
                Object obj6 = this.a;
                Optional optionalFindFirst = (Optional) obj;
                miq miqVar = new miq(obj6, 5);
                if (true == optionalFindFirst.isPresent()) {
                    Object obj7 = optionalFindFirst.get();
                    Object obj8 = miqVar.a;
                    Stream stream = Collection.EL.stream((yfq) obj7);
                    kqg kqgVar = ((mkz) obj8).c;
                    kqgVar.getClass();
                    optionalFindFirst = stream.filter(new lou(kqgVar, 20)).findFirst();
                    optionalFindFirst.getClass();
                }
                mla mlaVar = new mla(obj6, i4);
                if (true != optionalFindFirst.isPresent()) {
                    return;
                }
                ((mkz) mlaVar.a).q((kqg) optionalFindFirst.get());
                return;
            case 16:
                Optional optionalFindFirst2 = (Optional) obj;
                if (true == optionalFindFirst2.isPresent()) {
                    optionalFindFirst2 = Collection.EL.stream((yfq) optionalFindFirst2.get()).filter(new lye(i)).findFirst();
                    optionalFindFirst2.getClass();
                }
                mla mlaVar2 = new mla(this.a, i3);
                if (true != optionalFindFirst2.isPresent()) {
                    return;
                }
                Object obj9 = optionalFindFirst2.get();
                Object obj10 = mlaVar2.a;
                yzy yzyVar = yzy.tx;
                mks mksVar = (mks) obj10;
                if (mksVar.m == null) {
                    throw new IllegalStateException("Fragment must be present to supply UiContext for action being logged.");
                }
                ebf.j().F(rrc.h(yxy.GEARHEAD, mksVar.m.l(), yzyVar).l());
                ((ConnectACarActivity) obj10).finish();
                return;
            case 17:
                int iIntValue2 = ((Integer) obj).intValue();
                Object obj11 = this.a;
                if (iIntValue2 == 10) {
                    synchronized (((mlg) obj11).c) {
                        ((mku) obj11).o(new mld(obj11, i2));
                        if (((Boolean) ((mlg) obj11).e.orElse(true)).booleanValue()) {
                            ((mku) obj11).m(yzy.ts);
                            ((mlg) obj11).e = Optional.of(false);
                        }
                    }
                    return;
                }
                if (iIntValue2 != 12) {
                    return;
                }
                Object obj12 = ((mlg) obj11).c;
                synchronized (obj12) {
                    if (((mlg) obj11).e.isPresent() && !((Boolean) ((mlg) obj11).e.get()).booleanValue()) {
                        ((mku) obj11).m(yzy.tt);
                    }
                    ((mlg) obj11).e = Optional.of(true);
                    oqf oqfVar = ((mlg) obj11).f;
                    oqfVar.getClass();
                    ((mku) obj11).o(new mld(oqfVar, i3));
                    ((mlg) obj11).p();
                    synchronized (obj12) {
                        en enVar = ((mlg) obj11).d;
                        if (enVar != null) {
                            enVar.dismiss();
                            ((mlg) obj11).d = null;
                        }
                    }
                    return;
                }
                return;
            case 18:
                yfq yfqVar2 = (yfq) obj;
                if (yfqVar2.size() > 1) {
                    TroubleshooterActivity.A(yzy.Bk);
                } else {
                    TroubleshooterActivity.A(yzy.Bj);
                }
                ((TroubleshooterActivity) this.a).m.c(yfqVar2);
                return;
            case 19:
                mma mmaVar = (mma) obj;
                Object obj13 = this.a;
                mmo mmoVar = (mmo) obj13;
                if (mmoVar.g == mmaVar) {
                    ((ype) mmo.f.l().ai((char) 5062)).y("onSettingChanged(%s): ignoring because unchanged", mmaVar);
                    return;
                } else {
                    ((ype) mmo.f.l().ai(5061)).M("onSettingChanged(%s -> %s): invalidating", mmoVar.g, mmaVar);
                    ((qw) obj13).j();
                    return;
                }
            default:
                nfp nfpVar = (nfp) obj;
                Object obj14 = this.a;
                mmq mmqVar = (mmq) obj14;
                if (mmqVar.g == nfpVar) {
                    ((ype) mmq.f.l().ai((char) 5067)).y("onSettingChanged(%s): ignoring because unchanged", nfpVar);
                    return;
                } else {
                    ((ype) mmq.f.l().ai(5066)).M("onSettingChanged(%s -> %s): invalidating", mmqVar.g, nfpVar);
                    ((qw) obj14).j();
                    return;
                }
        }
    }
}
