package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.UserHandle;
import android.util.Log;
import android.view.ViewGroup;
import com.google.android.apps.auto.components.notifications.listener.ParceledNotificationList;
import com.google.android.enterprise.connectedapps.internal.CrossProfileBundleCallSender;
import com.google.android.gearhead.appdecor.StatusBarView;
import com.google.android.gearhead.demand.DemandClientService;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final /* synthetic */ class qct implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ qct(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException, InterruptedException, qdj, IOException, SecurityException, IllegalArgumentException {
        Object obj;
        qdb qdbVar;
        Bundle bundleMakeBundleCall;
        yfq yfqVar;
        MediaPlayer mediaPlayer = null;
        int i = 0;
        switch (this.b) {
            case 0:
                ((qcx) this.a).f("Timed out while waiting for onServiceConnected", null, false);
                return;
            case 1:
                Object obj2 = this.a;
                synchronized (((qbc) obj2).d) {
                    if (((qbc) obj2).e > ((qbc) obj2).f) {
                        Object obj3 = this.a;
                        long j = ((qbc) obj3).e;
                        long j2 = j - ((qbc) obj3).f;
                        ((qbc) obj3).f = j;
                        zgt zgtVar = ((qbc) obj3).h;
                        if (zgtVar != null) {
                            zgtVar.schedule(this, j2, TimeUnit.MILLISECONDS);
                        }
                        return;
                    }
                    ykd ykdVar = ((qbc) obj2).j;
                    if (ykdVar != null) {
                        synchronized (((qau) ykdVar.a).b) {
                        }
                    }
                    Object obj4 = this.a;
                    boolean z = ((qbc) obj4).b;
                    ((qbc) obj4).g = z;
                    if (z) {
                        zgt zgtVar2 = ((qbc) obj4).h;
                        tmb tmbVar = ((qbc) obj4).c;
                        if (tmbVar != null && zgtVar2 != null) {
                            ((qbc) obj4).f = tmbVar.a();
                            zgtVar2.schedule(this, ((qbc) obj4).a, TimeUnit.MILLISECONDS);
                        }
                    }
                    return;
                }
            case 2:
                Log.i("CrossProfileSender", "Attempting to bind");
                Object obj5 = this.a;
                qcx qcxVar = (qcx) obj5;
                ScheduledFuture scheduledFuture = (ScheduledFuture) qcxVar.h.getAndSet(null);
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                if (!qcxVar.e) {
                    qcxVar.f("Required APIs are unavailable. Binding is not possible.", null, false);
                    return;
                }
                if (qcxVar.o()) {
                    Log.i("CrossProfileSender", "Already bound");
                    qcxVar.g();
                    return;
                }
                if (qcxVar.j.isEmpty()) {
                    qcxVar.f("Not trying to bind", null, false);
                    return;
                }
                qcn qcnVar = qcxVar.p;
                Context context = qcxVar.c;
                if (!qcnVar.a(context)) {
                    qcxVar.f("Permission not granted", null, false);
                    return;
                }
                if (!qcxVar.n()) {
                    qcxVar.f("No profile available", null, false);
                    return;
                }
                AtomicReference atomicReference = qcxVar.i;
                if (atomicReference.get() != null) {
                    Log.i("CrossProfileSender", "Already waiting to bind");
                    return;
                }
                try {
                    atomicReference.set(((qcx) obj5).b.schedule(new qct(obj5, i), 1L, TimeUnit.MINUTES));
                    ComponentName componentName = ((qcx) obj5).d;
                    ServiceConnection serviceConnection = ((qcx) obj5).n;
                    UserHandle userHandleA = qcx.a(context, ((qcx) obj5).f);
                    if (userHandleA != null) {
                        Intent intent = new Intent();
                        intent.setComponent(componentName);
                        try {
                            if (((Boolean) context.getClass().getMethod("bindServiceAsUser", Intent.class, ServiceConnection.class, Integer.TYPE, UserHandle.class).invoke(context, intent, serviceConnection, 1, userHandleA)).booleanValue()) {
                                Log.i("CrossProfileSender", "binder.tryBind returned true, expecting onServiceConnected");
                                return;
                            }
                            context.unbindService(serviceConnection);
                        } catch (IllegalAccessException e) {
                            e = e;
                            throw new qdj(e);
                        } catch (NoSuchMethodException e2) {
                            e = e2;
                            throw new qdj(e);
                        } catch (InvocationTargetException e3) {
                            e = e3;
                            throw new qdj(e);
                        }
                    }
                    ((qcx) obj5).f("No profile available, app not installed in other profile, or service not included in manifest", null, false);
                    return;
                } catch (IllegalArgumentException e4) {
                    Log.e("CrossProfileSender", "IllegalArgumentException when trying to bind", e4);
                    qcxVar.f("IllegalArgumentException", e4, false);
                    return;
                } catch (qdj e5) {
                    Log.e("CrossProfileSender", "MissingApiException when trying to bind", e5);
                    qcxVar.f("Missing API", e5, false);
                    return;
                } catch (qdl e6) {
                    Log.e("CrossProfileSender", "Error while trying to bind", e6);
                    qcxVar.f(e6.getMessage(), e6, false);
                    return;
                }
            case 3:
                Log.i("CrossProfileSender", "drainAsyncQueue");
                do {
                    obj = this.a;
                    qcx qcxVar2 = (qcx) obj;
                    ConcurrentLinkedDeque concurrentLinkedDeque = qcxVar2.m;
                    qcw qcwVar = (qcw) concurrentLinkedDeque.pollFirst();
                    if (qcwVar == null) {
                        return;
                    }
                    qdbVar = new qdb(qcxVar2, qcwVar);
                    try {
                        qdf qdfVar = (qdf) ((qcx) obj).g.get();
                        if (qdfVar == null) {
                            Log.w("CrossProfileSender", "OngoingCrossProfileCall: not bound anymore, adding back to queue");
                            concurrentLinkedDeque.add(qcwVar);
                            return;
                        }
                        bundleMakeBundleCall = new CrossProfileBundleCallSender(qdfVar, qcwVar.a, qdbVar).makeBundleCall(qcwVar.b);
                    } catch (qdl unused) {
                        Log.w("CrossProfileSender", "OngoingCrossProfileCall: UnavailableProfileException, adding back to queue");
                        qcxVar2.m.add(qcwVar);
                        return;
                    }
                } while (!bundleMakeBundleCall.containsKey("throwable"));
                RuntimeException runtimeException = (RuntimeException) roc.bt(bundleMakeBundleCall);
                ((qcx) obj).h(qdbVar.a);
                throw new qdk(runtimeException);
            case 4:
                ((qcu) this.a).a.f("onNullBinding", null, true);
                return;
            case 5:
                qcx qcxVar3 = ((qcu) this.a).a;
                qcxVar3.l();
                qcxVar3.j(new qdl("Lost connection to other profile"));
                qcxVar3.m();
                qcxVar3.d();
                qcxVar3.c();
                qcxVar3.b();
                return;
            case 6:
                ((qcu) this.a).a.f("onBindingDied", null, true);
                return;
            case 7:
                qcx qcxVar4 = (qcx) this.a;
                if (qcxVar4.n() && qcxVar4.o != 2) {
                    qcxVar4.m();
                    return;
                } else {
                    if (qcxVar4.n() || qcxVar4.o == 1) {
                        return;
                    }
                    qcxVar4.m();
                    return;
                }
            case 8:
                ((qcx) this.a).e();
                return;
            case 9:
                nrq.b().a().fG(((raa) this.a).a);
                return;
            case 10:
                ((ViewGroup) this.a).removeAllViews();
                return;
            case 11:
                ((StatusBarView) this.a).g.setVisibility(8);
                return;
            case 12:
                ((StatusBarView) this.a).e.setVisibility(8);
                return;
            case 13:
                wer.b();
                ((qhj) this.a).b();
                return;
            case 14:
                ((ype) DemandClientService.a.l().ai((char) 7265)).u("closeDemandSpace");
                DemandClientService demandClientService = (DemandClientService) this.a;
                if (demandClientService.b.m()) {
                    demandClientService.b.j(ywk.UNKNOWN_CANCEL_TRIGGER);
                    return;
                }
                return;
            case 15:
                ((qhs) this.a).a();
                return;
            case 16:
                qhx qhxVar = (qhx) this.a;
                int i2 = qhxVar.q() ? qhxVar.r() ? 2 : 1 : 3;
                eqm eqmVar = qhxVar.e;
                int iIntValue = ((Integer) new ntn((Integer) eqmVar.e()).i(0)).intValue();
                eqm eqmVar2 = qhxVar.f;
                kxa kxaVar = (kxa) new ntn((kxa) eqmVar2.e()).i(kxa.a);
                if (i2 == iIntValue) {
                    lah.a();
                    lah.e(iIntValue != 1 ? iIntValue != 2 ? ywj.DEMAND_SPACE_REDUNDANT_STATE_CHANGE_UNAVAILABLE : ywj.DEMAND_SPACE_REDUNDANT_STATE_CHANGE_OPEN : ywj.DEMAND_SPACE_REDUNDANT_STATE_CHANGE_CLOSED, null);
                    if (qhxVar.i == kxaVar) {
                        ((ype) qhx.a.l().ai((char) 7301)).M("No state update. Still state %s, open trigger %s", qhx.o(iIntValue), kxaVar);
                        return;
                    }
                }
                ((ype) qhx.a.l().ai(7300)).T("New demand space state %s->%s, open trigger %s->%s. internal state: %s", qhx.o(iIntValue), qhx.o(i2), kxaVar, qhxVar.i, qhxVar.d);
                eqmVar.m(Integer.valueOf(i2));
                eqmVar2.m(qhxVar.i);
                return;
            case 17:
                yph yphVar = qie.a;
                yph yphVar2 = qia.a;
                Object obj6 = this.a;
                Context context2 = (Context) obj6;
                Uri uri = Uri.parse("android.resource://" + context2.getPackageName() + "/raw/car_feedback_notify");
                AudioManager audioManager = (AudioManager) context2.getSystemService("audio");
                MediaPlayer mediaPlayer2 = new MediaPlayer();
                mediaPlayer2.reset();
                mediaPlayer2.setAudioStreamType(3);
                try {
                    mediaPlayer2.setDataSource((Context) obj6, uri);
                    mediaPlayer2.setOnCompletionListener(new qhz(audioManager, 1));
                    mediaPlayer2.prepare();
                    mediaPlayer = mediaPlayer2;
                } catch (IOException unused2) {
                    ((ype) ((ype) qia.a.g()).ai((char) 7306)).u("Couldn't load feedback sound. Fail whale! No feedback sounds for you.");
                    mediaPlayer2.release();
                }
                yph yphVar3 = qia.a;
                ((ype) yphVar3.l().ai(7307)).y("maybePlaySound: %s play", mediaPlayer != null ? "will" : "will not");
                if (mediaPlayer != null) {
                    Semaphore semaphore = new Semaphore(0);
                    mediaPlayer.setOnCompletionListener(new qhz(semaphore, 0));
                    if (audioManager.requestAudioFocus(qia.b, 3, 3) == 0) {
                        ((ype) ((ype) yphVar3.g()).ai((char) 7308)).u("Couldn't obtain audio focus.");
                    }
                    mediaPlayer.seekTo(0);
                    mediaPlayer.start();
                    try {
                        semaphore.acquire();
                    } catch (InterruptedException unused3) {
                    }
                }
                if (mediaPlayer == null) {
                    return;
                }
                audioManager.abandonAudioFocus(qia.b);
                mediaPlayer.release();
                return;
            case 18:
                SharedPreferences sharedPreferences = ((qig) this.a).h;
                SharedPreferences.Editor editorPutBoolean = sharedPreferences.edit().putBoolean("rating_prompt_shown", true).putBoolean("ignored_last_prompt", true);
                oit.a();
                editorPutBoolean.putLong("last_rating_prompt_time", Instant.now().toEpochMilli()).putInt("prompt_shown_count", sharedPreferences.getInt("prompt_shown_count", 0) + 1).apply();
                return;
            case 19:
                qis qisVar = (qis) this.a;
                qiv qivVar = qisVar.a;
                if (!qivVar.c()) {
                    ((ype) qiv.a.l().ai((char) 7384)).u("Not connected, so not caching notifications");
                    return;
                }
                try {
                    ParceledNotificationList parceledNotificationListF = qivVar.f.f(null);
                    if (parceledNotificationListF == null) {
                        int i3 = yfq.d;
                        yfqVar = yls.a;
                    } else {
                        List list = parceledNotificationListF.a;
                        int size = list.size();
                        Stream streamFilter = Collection.EL.stream(list).filter(new oly(16));
                        int i4 = yfq.d;
                        yfqVar = (yfq) streamFilter.collect(ycm.a);
                        if (size != yfqVar.size()) {
                            ((ype) ((ype) qiv.a.h()).ai(7396)).u("Null items found when unparceling active notifications list");
                        }
                    }
                    qiv qivVar2 = qisVar.a;
                    List list2 = qivVar2.d;
                    list2.clear();
                    list2.addAll(yfqVar);
                    qivVar2.j.t();
                    return;
                } catch (RemoteException e7) {
                    throw new IllegalStateException("Could not call the service", e7);
                }
            default:
                qiv qivVar3 = ((qis) this.a).a;
                qivVar3.c.b(4);
                qivVar3.f = null;
                return;
        }
    }

    public qct(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
