package org.apache.tika.parser;

import Rc.b;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.UUID;
import org.apache.tika.mime.a;

/* loaded from: classes5.dex */
public abstract class AbstractExternalProcessParser implements Parser {
    private static final ConcurrentHashMap<String, Process> PROCESS_MAP = new ConcurrentHashMap<>();
    private static final long serialVersionUID = 7186985395903074255L;

    static {
        Runtime.getRuntime().addShutdownHook(new Thread(new b(2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0() {
        PROCESS_MAP.forEachValue(1L, new a(1));
    }

    public String register(Process process) {
        String string = UUID.randomUUID().toString();
        PROCESS_MAP.put(string, process);
        return string;
    }

    public Process release(String str) {
        return PROCESS_MAP.remove(str);
    }
}
