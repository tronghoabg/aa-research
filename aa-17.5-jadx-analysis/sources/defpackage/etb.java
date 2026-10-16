package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

@Deprecated
/* loaded from: classes.dex */
public final class etb {
    private static final Object d = new Object();
    private static etb e;
    public final Context a;
    private final Handler g;
    public final HashMap b = new HashMap();
    private final HashMap f = new HashMap();
    public final ArrayList c = new ArrayList();

    private etb(Context context) {
        this.a = context;
        this.g = new esz(this, context.getMainLooper());
    }

    public static etb a(Context context) {
        etb etbVar;
        synchronized (d) {
            etbVar = e;
            if (etbVar == null) {
                etbVar = new etb(context.getApplicationContext());
                e = etbVar;
            }
        }
        return etbVar;
    }

    public final void b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        HashMap map = this.b;
        synchronized (map) {
            eta etaVar = new eta(intentFilter, broadcastReceiver);
            ArrayList arrayList = (ArrayList) map.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                map.put(broadcastReceiver, arrayList);
            }
            arrayList.add(etaVar);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                HashMap map2 = this.f;
                ArrayList arrayList2 = (ArrayList) map2.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    map2.put(action, arrayList2);
                }
                arrayList2.add(etaVar);
            }
        }
    }

    public final void c(BroadcastReceiver broadcastReceiver) {
        HashMap map = this.b;
        synchronized (map) {
            ArrayList arrayList = (ArrayList) map.remove(broadcastReceiver);
            if (arrayList == null) {
                return;
            }
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    return;
                }
                eta etaVar = (eta) arrayList.get(size);
                etaVar.d = true;
                int i = 0;
                while (true) {
                    IntentFilter intentFilter = etaVar.a;
                    if (i < intentFilter.countActions()) {
                        String action = intentFilter.getAction(i);
                        HashMap map2 = this.f;
                        ArrayList arrayList2 = (ArrayList) map2.get(action);
                        if (arrayList2 != null) {
                            int size2 = arrayList2.size();
                            while (true) {
                                size2--;
                                if (size2 < 0) {
                                    break;
                                }
                                eta etaVar2 = (eta) arrayList2.get(size2);
                                if (etaVar2.b == broadcastReceiver) {
                                    etaVar2.d = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                map2.remove(action);
                            }
                        }
                        i++;
                    }
                }
            }
        }
    }

    public final void d(Intent intent) {
        ArrayList arrayList;
        int i;
        synchronized (this.b) {
            String action = intent.getAction();
            String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z = (intent.getFlags() & 8) != 0;
            if (z) {
                Log.v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList arrayList2 = (ArrayList) this.f.get(intent.getAction());
            if (arrayList2 != null) {
                if (z) {
                    Log.v("LocalBroadcastManager", "Action list: " + arrayList2);
                }
                int i2 = 0;
                ArrayList arrayList3 = null;
                while (i2 < arrayList2.size()) {
                    eta etaVar = (eta) arrayList2.get(i2);
                    if (z) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + etaVar.a);
                    }
                    if (etaVar.c) {
                        if (z) {
                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                        }
                        i = i2;
                        arrayList = arrayList3;
                    } else {
                        arrayList = arrayList3;
                        int iMatch = etaVar.a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (iMatch >= 0) {
                            if (z) {
                                StringBuilder sb = new StringBuilder();
                                i = i2;
                                sb.append("  Filter matched!  match=0x");
                                sb.append(Integer.toHexString(iMatch));
                                Log.v("LocalBroadcastManager", sb.toString());
                            } else {
                                i = i2;
                            }
                            arrayList3 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList3.add(etaVar);
                            etaVar.c = true;
                            i2 = i + 1;
                        } else {
                            i = i2;
                            if (z) {
                                Log.v("LocalBroadcastManager", a.bz(iMatch != -4 ? iMatch != -3 ? iMatch != -2 ? iMatch != -1 ? "unknown reason" : RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA : "data" : "action" : "category", "  Filter did not match: "));
                            }
                        }
                    }
                    arrayList3 = arrayList;
                    i2 = i + 1;
                }
                ArrayList arrayList4 = arrayList3;
                if (arrayList4 != null) {
                    for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                        ((eta) arrayList4.get(i3)).c = false;
                    }
                    this.c.add(new sx(intent, arrayList4, (byte[]) null));
                    Handler handler = this.g;
                    if (!handler.hasMessages(1)) {
                        handler.sendEmptyMessage(1);
                    }
                }
            }
        }
    }
}
