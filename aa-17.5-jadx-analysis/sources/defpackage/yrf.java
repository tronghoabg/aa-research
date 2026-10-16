package defpackage;

import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* loaded from: classes3.dex */
public final class yrf extends LogRecord {
    private static final Object[] b;
    public final yqk a;
    private final ypo c;

    static {
        new yre();
        b = new Object[0];
    }

    protected yrf(ypo ypoVar, ypt yptVar) {
        super(ypoVar.g(), null);
        this.c = ypoVar;
        this.a = yqk.g(yptVar, ypoVar.c());
        yok yokVarAn = ypoVar.an();
        setSourceClassName(yokVarAn.b());
        setSourceMethodName(yokVarAn.d());
        setLoggerName(ypoVar.f());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        setMillis(ypoVar.am() / 1000000);
        super.setParameters(b);
    }

    private static void a(ypo ypoVar, StringBuilder sb) {
        sb.append("  original message: ");
        if (ypoVar.d() == null) {
            sb.append(ypr.b(ypoVar.e()));
        } else {
            sb.append(ypoVar.d().b);
            sb.append("\n  original arguments:");
            for (Object obj : ypoVar.i()) {
                sb.append("\n    ");
                sb.append(ypr.b(obj));
            }
        }
        ypt yptVarC = ypoVar.c();
        if (yptVarC.b() > 0) {
            sb.append("\n  metadata:");
            for (int i = 0; i < yptVarC.b(); i++) {
                sb.append("\n    ");
                sb.append(yptVarC.c(i).a);
                sb.append(": ");
                sb.append(ypr.b(yptVarC.e(i)));
            }
        }
        sb.append("\n  level: ");
        sb.append(ypr.b(ypoVar.g()));
        sb.append("\n  timestamp (nanos): ");
        sb.append(ypoVar.am());
        sb.append("\n  class: ");
        sb.append(ypoVar.an().b());
        sb.append("\n  method: ");
        sb.append(ypoVar.an().d());
        sb.append("\n  line number: ");
        sb.append(ypoVar.an().a());
    }

    @Override // java.util.logging.LogRecord
    public final String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            ypo ypoVar = this.c;
            yqk yqkVar = this.a;
            yqo yqoVar = (yqo) yqp.a;
            if (yqp.a(ypoVar, yqkVar, yqoVar.b)) {
                StringBuilder sb = new StringBuilder();
                ysa.e(ypoVar, sb);
                yqp.b(yqkVar, yqoVar.a, sb);
                message = sb.toString();
            } else {
                Object objE = ypoVar.e();
                try {
                    message = ypr.c(objE);
                } catch (RuntimeException e) {
                    message = ypr.a(objE, e);
                }
            }
            super.setMessage(message);
        }
        return message;
    }

    @Override // java.util.logging.LogRecord
    public final void setMessage(String str) {
        if (str == null) {
            str = "";
        }
        super.setMessage(str);
    }

    @Override // java.util.logging.LogRecord
    public final void setParameters(Object[] objArr) {
        getMessage();
        if (objArr == null) {
            objArr = b;
        }
        super.setParameters(objArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" {\n  message: ");
        sb.append(getMessage());
        sb.append("\n  arguments: ");
        sb.append(getParameters() != null ? Arrays.asList(getParameters()) : "<none>");
        sb.append('\n');
        a(this.c, sb);
        sb.append("\n}");
        return sb.toString();
    }

    @Override // java.util.logging.LogRecord
    public final void setResourceBundle(ResourceBundle resourceBundle) {
    }

    @Override // java.util.logging.LogRecord
    public final void setResourceBundleName(String str) {
    }

    protected yrf(RuntimeException runtimeException, ypo ypoVar, ypt yptVar) {
        this(ypoVar, yptVar);
        setLevel(ypoVar.g().intValue() < Level.WARNING.intValue() ? Level.WARNING : ypoVar.g());
        setThrown(runtimeException);
        StringBuilder sb = new StringBuilder("LOGGING ERROR: ");
        sb.append(runtimeException.getMessage());
        sb.append('\n');
        a(ypoVar, sb);
        super.setMessage(sb.toString());
    }

    public yrf(ypo ypoVar, ypt yptVar, byte[] bArr) {
        this(ypoVar, yptVar);
        setThrown((Throwable) this.a.b(yof.a));
        getMessage();
    }
}
