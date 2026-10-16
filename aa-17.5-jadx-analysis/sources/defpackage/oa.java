package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.RemoteException;
import android.text.Layout;
import android.util.SparseArray;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.apps.auto.components.system.transcription.TranscriptionFragment;
import com.google.android.apps.auto.components.telecom.call.CarCall;
import com.google.android.gms.car.AudioFocusInfo;
import com.google.android.gms.car.InputFocusChangedEvent;
import com.google.android.projection.gearhead.R;
import j$.time.Duration;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class oa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public oa(TextView textView, Typeface typeface, int i, int i2) {
        this.d = i2;
        this.b = textView;
        this.c = typeface;
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v27, types: [android.bluetooth.BluetoothProfile$ServiceListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v28, types: [android.bluetooth.BluetoothProfile$ServiceListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v33, types: [java.lang.Object, pab] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, ox] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Serializable, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() throws IOException {
        Configuration configuration;
        int i = 3;
        switch (this.d) {
            case 0:
                int i2 = this.a;
                pc pcVar = (pc) this.c;
                String str = (String) pcVar.a.get(Integer.valueOf(i2));
                if (str == null) {
                    return;
                }
                bii biiVar = (bii) pcVar.d.get(str);
                Object obj = biiVar != null ? biiVar.b : null;
                Object obj2 = ((sm) this.b).a;
                if (obj == null) {
                    pcVar.f.remove(str);
                    pcVar.e.put(str, obj2);
                    return;
                } else {
                    ?? r1 = biiVar.b;
                    if (pcVar.c.remove(str)) {
                        r1.a(obj2);
                        return;
                    }
                    return;
                }
            case 1:
                jw.b((TextView) this.b, (Typeface) this.c, this.a);
                return;
            case 2:
                ((pc) this.b).e(this.a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (Serializable) this.c));
                return;
            case 3:
                ((hhy) this.c).a.a.y().a(this.b, this.a);
                return;
            case 4:
                int i3 = this.a;
                ?? r12 = this.b;
                Object obj3 = this.c;
                ((hhy) obj3).a.n("showToast", new oa(obj3, (CharSequence) r12, i3, i));
                return;
            case 5:
                ((qui) this.b).a.c((AudioFocusInfo) this.c, this.a);
                return;
            case 6:
                Object obj4 = this.b;
                jln jlnVar = (jln) obj4;
                jlnVar.g();
                jlm jlmVar = jlnVar.j;
                woy.aa(!jlmVar.d, "Handoff already initiated");
                woy.aa(jlmVar.a, "StartupService is not bound");
                ComponentName componentName = jlmVar.e;
                componentName.getClass();
                rwv rwvVar = jlmVar.f;
                rwvVar.getClass();
                Object obj5 = this.c;
                try {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("com.google.android.gms.car.extra.EXTRA_CONNECTION_HANDOFF_COMPONENT", componentName);
                    ols.L(((jln) obj4).b, "com.google.android.gms.car.CONNECTION_HANDOFF", rrx.a, bundle);
                    jlmVar.d = true;
                    ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) ((Bundle) obj5).getParcelable("car_setup.EXTRA_CAR_CONNECTION_FILE_DESCRIPTOR");
                    int i4 = this.a;
                    woy.O(i4 == 2 || parcelFileDescriptor != null, "File descriptor must not be null except for wifi connections");
                    ype ypeVar = (ype) ((ype) jln.a.f()).ai(2319);
                    long j = ((jln) obj4).c;
                    ypeVar.F("Handing off session %d (%d)", j, i4);
                    rwvVar.d(j, i4, (Bundle) obj5, jlmVar.c);
                    if (parcelFileDescriptor != null) {
                        try {
                            parcelFileDescriptor.close();
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    }
                    return;
                } catch (RemoteException e) {
                    ols.L(jlnVar.b, "com.google.android.gms.car.CONNECTION_HANDOFF", rrx.c, null);
                    ((ype) ((ype) ((ype) jln.a.g()).p(e)).ai((char) 2321)).u("Connection handoff failed due to RemoteException, exiting");
                    throw new RuntimeException(e);
                }
            case 7:
                String str2 = (String) this.b;
                boolean zC = odg.c(str2);
                Object obj6 = this.c;
                if (!zC) {
                    ((odf) obj6).a.b();
                    return;
                }
                TranscriptionFragment transcriptionFragmentA = ((odf) obj6).a.a();
                if (transcriptionFragmentA != null) {
                    transcriptionFragmentA.b(new TranscriptionFragment.PendingTranscriptionState("", str2, true, this.a, null));
                    return;
                }
                return;
            case 8:
                Iterator it = ((ogr) this.b).a.b.iterator();
                while (it.hasNext()) {
                    ((ebf) it.next()).y((CarCall) this.c, this.a);
                }
                return;
            case 9:
                Iterator it2 = ((ogr) this.b).a.b.iterator();
                while (it2.hasNext()) {
                    ((ebf) it2.next()).w((CarCall) this.c, this.a);
                }
                return;
            case 10:
                Rect rect = new Rect();
                View view = (View) this.c;
                view.getHitRect(rect);
                int iHeight = rect.height();
                int i5 = this.a;
                if (iHeight < i5) {
                    int i6 = (i5 - iHeight) / 2;
                    rect.top -= i6;
                    rect.bottom += i6;
                }
                int iWidth = rect.width();
                if (iWidth < i5) {
                    int i7 = (i5 - iWidth) / 2;
                    rect.left -= i7;
                    rect.right += i7;
                }
                ((View) this.b).setTouchDelegate(new TouchDelegate(rect, view));
                return;
            case 11:
                int i8 = oza.g;
                ozb ozbVar = (ozb) this.b;
                if (ozbVar.f()) {
                    ozbVar.j.put(Integer.valueOf(this.a), this.c);
                    return;
                }
                return;
            case 12:
                ozb ozbVar2 = (ozb) this.b;
                ozbVar2.e.getProfileProxy(ozbVar2.b, this.c, this.a);
                return;
            case 13:
                ozb ozbVar3 = (ozb) this.b;
                Context context = ozbVar3.b;
                BluetoothAdapter bluetoothAdapter = ozbVar3.e;
                int i9 = this.a;
                if (bluetoothAdapter.getProfileProxy(context, this.c, i9)) {
                    return;
                }
                ols.N(context, yxi.WIRELESS_BLUETOOTH_TRACKER_PROXY_FAILURE, i9);
                return;
            case 14:
                int i10 = this.a;
                Object obj7 = this.c;
                Object obj8 = this.b;
                if (i10 == 2) {
                    ((pca) obj8).d.add(obj7);
                } else {
                    ((pca) obj8).d.remove(obj7);
                }
                ((pca) obj8).g();
                return;
            case 15:
                wer.c();
                yph yphVar = pgr.a;
                ype ypeVar2 = (ype) yphVar.l().ai(6518);
                Object obj9 = this.b;
                pgr pgrVar = (pgr) obj9;
                Duration duration = pgrVar.J;
                int i11 = this.a;
                ypeVar2.K("WifiInfoResponse wasn't received within %s, attempt: %d", duration, i11);
                pgrVar.w(yxi.WIRELESS_RFCOMM_INFO_RESPONSE_MISSING);
                if (i11 < 2) {
                    pgrVar.B(this.c, i11 + 1);
                    return;
                }
                ((ype) ((ype) yphVar.h()).ai((char) 6519)).u("WifiInfoRequest attempts exhausted, force-reconnecting WPP");
                pgrVar.w(yxi.WIRELESS_RFCOMM_CLOSE_SOCKET_DUE_TO_MISSING_INFO_RESPONSE);
                ((ype) ((ype) yphVar.f()).ai((char) 6520)).u("Restarting WPP on missing wifi info response.");
                pgrVar.D(ozr.f);
                synchronized (pgrVar.l) {
                    ((pgr) obj9).M = 0;
                }
                return;
            case 16:
                rgd.a.f().ai(7994).w("startHandlerLoop with thread priority %d.", Process.getThreadPriority(Process.myTid()));
                int i12 = this.a;
                rgd rgdVar = (rgd) this.b;
                rgdVar.d = new byte[i12];
                rgdVar.e = new ParcelFileDescriptor.AutoCloseOutputStream((ParcelFileDescriptor) this.c);
                rgdVar.b.d();
                rgdVar.a();
                return;
            case 17:
                Object obj10 = this.b;
                if (rrd.e("CAR.PROJECTION.CAHI", 2)) {
                    Object obj11 = this.c;
                    int i13 = this.a;
                    SparseArray sparseArray = rnw.a;
                    rnw rnwVar = (rnw) obj10;
                    rrd.d(2, "CAR.PROJECTION.CAHI", null, "%s onMotionEvent(displayId:%d, event:%s) runOnMain [serviceActivityNull:%b, serviceHasWindowFocus:%b]", rnwVar.t, Integer.valueOf(i13), obj11, Boolean.valueOf(rnwVar.I == null), Boolean.valueOf(rnwVar.g()));
                }
                rnw rnwVar2 = (rnw) obj10;
                if (rnwVar2.I == null || rnwVar2.g()) {
                    return;
                }
                if (rrd.e("CAR.PROJECTION.CAHI", 2)) {
                    rrd.d(2, "CAR.PROJECTION.CAHI", null, "%s onInputFocusChange(hasFocus:%b, notInTouchMode:%b, callback:%b)", rnwVar2.t, true, false, false);
                }
                rnwVar2.o(new InputFocusChangedEvent(true, true, -1, null), false);
                return;
            case 18:
                rzx rzxVar = (rzx) ((qzb) this.b).a.get();
                if (rzxVar != null) {
                    int i14 = this.a;
                    Object obj12 = this.c;
                    if (omc.c("CAR.CLIENT.WM.WIN", 3)) {
                        rrd.d(3, "CAR.CLIENT.WM.WIN", null, "%s onVideoConfigurationChanged(%s, %d)", rzxVar.a, obj12, Integer.valueOf(i14));
                    }
                    if (rzxVar.j == null || rzxVar.g == null || rzxVar.f == null) {
                        return;
                    }
                    Configuration configuration2 = (Configuration) obj12;
                    if ((configuration2.uiMode & 48) != (rzxVar.f.getResources().getConfiguration().uiMode & 48)) {
                        Configuration configuration3 = rzxVar.h;
                        rzx.q(configuration3, rzxVar.f.getResources().getConfiguration(), configuration2);
                        rzxVar.f.unregisterComponentCallbacks(rzxVar);
                        rzxVar.f = rzxVar.a(rzxVar.d, configuration3, rzxVar.g.e());
                        rzxVar.f.registerComponentCallbacks(rzxVar);
                    }
                    if (rzxVar.n && Build.VERSION.SDK_INT >= 31 && configuration2.fontWeightAdjustment != rzxVar.f.getResources().getConfiguration().fontWeightAdjustment) {
                        rzxVar.f.getResources().getConfiguration().fontWeightAdjustment = configuration2.fontWeightAdjustment;
                    }
                    if (((~rzxVar.e) & i14) != 0) {
                        rzxVar.j = rzxVar.b.a(rzxVar.f);
                        rzxVar.g.q(rzxVar.j);
                        return;
                    }
                    rzxVar.j.getContext().getResources().updateConfiguration(rzxVar.f.getResources().getConfiguration(), rzxVar.f.getResources().getDisplayMetrics());
                    View view2 = rzxVar.j;
                    if (rzxVar.m) {
                        configuration = rzxVar.f.getResources().getConfiguration();
                        configuration.uiMode &= -16;
                        configuration.uiMode |= 3;
                    } else {
                        configuration = rzxVar.f.getResources().getConfiguration();
                    }
                    view2.dispatchConfigurationChanged(configuration);
                    return;
                }
                return;
            case 19:
                ((uoa) ((uns) this.c).d.a()).l(this.a, (abfu) this.b);
                return;
            default:
                Layout layout = ((TextView) ((ep) this.b).findViewById(R.id.license_activity_textview)).getLayout();
                if (layout != null) {
                    ((ScrollView) this.c).scrollTo(0, layout.getLineTop(layout.getLineForOffset(this.a)));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ oa(Object obj, int i, Object obj2, int i2) {
        this.d = i2;
        this.b = obj;
        this.a = i;
        this.c = obj2;
    }

    public /* synthetic */ oa(Object obj, int i, Object obj2, int i2, byte[] bArr) {
        this.d = i2;
        this.c = obj;
        this.a = i;
        this.b = obj2;
    }

    public /* synthetic */ oa(Object obj, CharSequence charSequence, int i, int i2) {
        this.d = i2;
        this.c = obj;
        this.b = charSequence;
        this.a = i;
    }

    public /* synthetic */ oa(Object obj, Object obj2, int i, int i2) {
        this.d = i2;
        this.b = obj;
        this.c = obj2;
        this.a = i;
    }
}
