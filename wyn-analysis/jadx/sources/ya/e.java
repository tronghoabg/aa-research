package ya;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class e {
    private final Map zza = new HashMap();

    public abstract Object create(Object obj);

    public Object get(Object obj) {
        synchronized (this.zza) {
            try {
                if (this.zza.containsKey(obj)) {
                    return this.zza.get(obj);
                }
                Object objCreate = create(obj);
                this.zza.put(obj, objCreate);
                return objCreate;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
