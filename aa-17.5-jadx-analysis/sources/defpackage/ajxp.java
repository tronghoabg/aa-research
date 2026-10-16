package defpackage;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.commons.logging.LogConfigurationException;
import org.apache.commons.logging.LogFactory;

@Deprecated
/* loaded from: classes2.dex */
public class ajxp {
    protected final Lock a;
    protected final Set b;

    protected ajxp() throws LogConfigurationException {
        LogFactory.getLog(getClass());
        this.b = new HashSet();
        new akat();
        this.a = new ReentrantLock();
    }
}
