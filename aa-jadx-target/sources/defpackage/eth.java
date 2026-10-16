package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@java.lang.Deprecated
public final class eth {
    private static final java.lang.Object d = new java.lang.Object();
    private static defpackage.eth e;
    public final android.content.Context a;
    private final android.os.Handler g;
    public final java.util.HashMap b = new java.util.HashMap();
    private final java.util.HashMap f = new java.util.HashMap();
    public final java.util.ArrayList c = new java.util.ArrayList();

    private eth(android.content.Context context) {
        this.a = context;
        this.g = new defpackage.etf(this, context.getMainLooper());
    }

    public static defpackage.eth a(android.content.Context context) {
        defpackage.eth ethVar;
        synchronized (d) {
            ethVar = e;
            if (ethVar == null) {
                ethVar = new defpackage.eth(context.getApplicationContext());
                e = ethVar;
            }
        }
        return ethVar;
    }

    public final void b(android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter) {
        java.util.HashMap map = this.b;
        synchronized (map) {
            defpackage.etg etgVar = new defpackage.etg(intentFilter, broadcastReceiver);
            java.util.ArrayList arrayList = (java.util.ArrayList) map.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList(1);
                map.put(broadcastReceiver, arrayList);
            }
            arrayList.add(etgVar);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                java.lang.String action = intentFilter.getAction(i);
                java.util.HashMap map2 = this.f;
                java.util.ArrayList arrayList2 = (java.util.ArrayList) map2.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new java.util.ArrayList(1);
                    map2.put(action, arrayList2);
                }
                arrayList2.add(etgVar);
            }
        }
    }

    public final void c(android.content.BroadcastReceiver broadcastReceiver) {
        java.util.HashMap map = this.b;
        synchronized (map) {
            java.util.ArrayList arrayList = (java.util.ArrayList) map.remove(broadcastReceiver);
            if (arrayList == null) {
                return;
            }
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    return;
                }
                defpackage.etg etgVar = (defpackage.etg) arrayList.get(size);
                etgVar.d = true;
                int i = 0;
                while (true) {
                    android.content.IntentFilter intentFilter = etgVar.a;
                    if (i < intentFilter.countActions()) {
                        java.lang.String action = intentFilter.getAction(i);
                        java.util.HashMap map2 = this.f;
                        java.util.ArrayList arrayList2 = (java.util.ArrayList) map2.get(action);
                        if (arrayList2 != null) {
                            int size2 = arrayList2.size();
                            while (true) {
                                size2--;
                                if (size2 < 0) {
                                    break;
                                }
                                defpackage.etg etgVar2 = (defpackage.etg) arrayList2.get(size2);
                                if (etgVar2.b == broadcastReceiver) {
                                    etgVar2.d = true;
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

    public final void d(android.content.Intent intent) {
        java.lang.String str;
        synchronized (this.b) {
            java.lang.String action = intent.getAction();
            java.lang.String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.a.getContentResolver());
            android.net.Uri data = intent.getData();
            java.lang.String scheme = intent.getScheme();
            java.util.Set<java.lang.String> categories = intent.getCategories();
            boolean z = (intent.getFlags() & 8) != 0;
            if (z) {
                android.util.Log.v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            java.util.ArrayList arrayList = (java.util.ArrayList) this.f.get(intent.getAction());
            if (arrayList != null) {
                if (z) {
                    android.util.Log.v("LocalBroadcastManager", "Action list: " + arrayList);
                }
                java.util.ArrayList arrayList2 = null;
                int i = 0;
                while (i < arrayList.size()) {
                    defpackage.etg etgVar = (defpackage.etg) arrayList.get(i);
                    if (z) {
                        android.util.Log.v("LocalBroadcastManager", "Matching against filter " + etgVar.a);
                    }
                    if (etgVar.c) {
                        if (z) {
                            android.util.Log.v("LocalBroadcastManager", "  Filter's target already added");
                        }
                        arrayList = arrayList;
                    } else {
                        int iMatch = etgVar.a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (iMatch >= 0) {
                            if (z) {
                                android.util.Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + java.lang.Integer.toHexString(iMatch));
                            }
                            if (arrayList2 == null) {
                                arrayList2 = new java.util.ArrayList();
                            }
                            arrayList2.add(etgVar);
                            etgVar.c = true;
                        } else {
                            arrayList = arrayList;
                            if (z) {
                                if (iMatch == -4) {
                                    str = "category";
                                } else if (iMatch == -3) {
                                    str = "action";
                                } else if (iMatch != -2) {
                                    str = iMatch != -1 ? "unknown reason" : "type";
                                } else {
                                    str = "data";
                                }
                                android.util.Log.v("LocalBroadcastManager", defpackage.a.bA(str, "  Filter did not match: "));
                            }
                        }
                    }
                    i++;
                    arrayList = arrayList;
                }
                if (arrayList2 != null) {
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        ((defpackage.etg) arrayList2.get(i2)).c = false;
                    }
                    this.c.add(new defpackage.tc(intent, arrayList2));
                    android.os.Handler handler = this.g;
                    if (!handler.hasMessages(1)) {
                        handler.sendEmptyMessage(1);
                    }
                }
            }
        }
    }
}
