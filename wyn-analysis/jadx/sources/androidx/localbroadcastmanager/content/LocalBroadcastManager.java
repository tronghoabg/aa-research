package androidx.localbroadcastmanager.content;

import V5.c;
import X2.j;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

@Deprecated
/* loaded from: classes.dex */
public final class LocalBroadcastManager {
    private static final boolean DEBUG = false;
    static final int MSG_EXEC_PENDING_BROADCASTS = 1;
    private static final String TAG = "LocalBroadcastManager";
    private static LocalBroadcastManager mInstance;
    private static final Object mLock = new Object();
    private final Context mAppContext;
    private final Handler mHandler;
    private final HashMap<BroadcastReceiver, ArrayList<a>> mReceivers = new HashMap<>();
    private final HashMap<String, ArrayList<a>> mActions = new HashMap<>();
    private final ArrayList<j> mPendingBroadcasts = new ArrayList<>();

    private LocalBroadcastManager(Context context) {
        this.mAppContext = context;
        this.mHandler = new c(this, context.getMainLooper(), 2);
    }

    public static LocalBroadcastManager getInstance(Context context) {
        LocalBroadcastManager localBroadcastManager;
        synchronized (mLock) {
            try {
                if (mInstance == null) {
                    mInstance = new LocalBroadcastManager(context.getApplicationContext());
                }
                localBroadcastManager = mInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return localBroadcastManager;
    }

    public void executePendingBroadcasts() {
        int size;
        j[] jVarArr;
        while (true) {
            synchronized (this.mReceivers) {
                try {
                    size = this.mPendingBroadcasts.size();
                    if (size <= 0) {
                        return;
                    }
                    jVarArr = new j[size];
                    this.mPendingBroadcasts.toArray(jVarArr);
                    this.mPendingBroadcasts.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i5 = 0; i5 < size; i5++) {
                j jVar = jVarArr[i5];
                int size2 = ((ArrayList) jVar.f16076c).size();
                for (int i10 = 0; i10 < size2; i10++) {
                    a aVar = (a) ((ArrayList) jVar.f16076c).get(i10);
                    if (!aVar.f18705d) {
                        aVar.f18703b.onReceive(this.mAppContext, (Intent) jVar.f16075b);
                    }
                }
            }
        }
    }

    public void registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.mReceivers) {
            try {
                a aVar = new a(broadcastReceiver, intentFilter);
                ArrayList<a> arrayList = this.mReceivers.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    this.mReceivers.put(broadcastReceiver, arrayList);
                }
                arrayList.add(aVar);
                for (int i5 = 0; i5 < intentFilter.countActions(); i5++) {
                    String action = intentFilter.getAction(i5);
                    ArrayList<a> arrayList2 = this.mActions.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>(1);
                        this.mActions.put(action, arrayList2);
                    }
                    arrayList2.add(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean sendBroadcast(Intent intent) {
        ArrayList<a> arrayList;
        synchronized (this.mReceivers) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.mAppContext.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z2 = (intent.getFlags() & 8) != 0;
                if (z2) {
                    Log.v(TAG, "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList<a> arrayList2 = this.mActions.get(intent.getAction());
                if (arrayList2 != null) {
                    if (z2) {
                        Log.v(TAG, "Action list: " + arrayList2);
                    }
                    ArrayList arrayList3 = null;
                    int i5 = 0;
                    while (i5 < arrayList2.size()) {
                        a aVar = arrayList2.get(i5);
                        if (z2) {
                            Log.v(TAG, "Matching against filter " + aVar.f18702a);
                        }
                        if (aVar.f18704c) {
                            if (z2) {
                                Log.v(TAG, "  Filter's target already added");
                            }
                            arrayList = arrayList2;
                        } else {
                            int iMatch = aVar.f18702a.match(action, strResolveTypeIfNeeded, scheme, data, categories, TAG);
                            if (iMatch >= 0) {
                                if (z2) {
                                    StringBuilder sb2 = new StringBuilder();
                                    arrayList = arrayList2;
                                    sb2.append("  Filter matched!  match=0x");
                                    sb2.append(Integer.toHexString(iMatch));
                                    Log.v(TAG, sb2.toString());
                                } else {
                                    arrayList = arrayList2;
                                }
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(aVar);
                                aVar.f18704c = true;
                            } else {
                                arrayList = arrayList2;
                                if (z2) {
                                    Log.v(TAG, "  Filter did not match: " + (iMatch != -4 ? iMatch != -3 ? iMatch != -2 ? iMatch != -1 ? "unknown reason" : "type" : JsonStorageKeyNames.DATA_KEY : HandleInvocationsFromAdViewer.KEY_ACTION : "category"));
                                }
                            }
                        }
                        i5++;
                        arrayList2 = arrayList;
                    }
                    if (arrayList3 != null) {
                        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                            ((a) arrayList3.get(i10)).f18704c = false;
                        }
                        this.mPendingBroadcasts.add(new j(5, intent, arrayList3));
                        if (!this.mHandler.hasMessages(1)) {
                            this.mHandler.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void sendBroadcastSync(Intent intent) {
        if (sendBroadcast(intent)) {
            executePendingBroadcasts();
        }
    }

    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        synchronized (this.mReceivers) {
            try {
                ArrayList<a> arrayListRemove = this.mReceivers.remove(broadcastReceiver);
                if (arrayListRemove == null) {
                    return;
                }
                for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                    a aVar = arrayListRemove.get(size);
                    aVar.f18705d = true;
                    for (int i5 = 0; i5 < aVar.f18702a.countActions(); i5++) {
                        String action = aVar.f18702a.getAction(i5);
                        ArrayList<a> arrayList = this.mActions.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                a aVar2 = arrayList.get(size2);
                                if (aVar2.f18703b == broadcastReceiver) {
                                    aVar2.f18705d = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.mActions.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
