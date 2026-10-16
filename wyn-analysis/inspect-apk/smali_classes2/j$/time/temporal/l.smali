.class public abstract synthetic Lj$/time/temporal/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final a:Lj$/time/temporal/r;

.field static final b:Lj$/time/temporal/r;

.field static final c:Lj$/time/temporal/r;

.field static final d:Lj$/time/temporal/r;

.field static final e:Lj$/time/temporal/r;

.field static final f:Lj$/time/temporal/r;

.field static final g:Lj$/time/temporal/r;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 344
    new-instance v0, Lj$/time/temporal/o;

    const/4 v1, 0x1

    .line 344
    invoke-direct {v0, v1}, Lj$/time/temporal/o;-><init>(I)V

    .line 344
    sput-object v0, Lj$/time/temporal/l;->a:Lj$/time/temporal/r;

    .line 359
    new-instance v0, Lj$/time/temporal/o;

    const/4 v1, 0x2

    .line 359
    invoke-direct {v0, v1}, Lj$/time/temporal/o;-><init>(I)V

    .line 359
    sput-object v0, Lj$/time/temporal/l;->b:Lj$/time/temporal/r;

    .line 375
    new-instance v0, Lj$/time/temporal/o;

    const/4 v1, 0x3

    .line 375
    invoke-direct {v0, v1}, Lj$/time/temporal/o;-><init>(I)V

    .line 375
    sput-object v0, Lj$/time/temporal/l;->c:Lj$/time/temporal/r;

    .line 391
    new-instance v0, Lj$/time/temporal/o;

    const/4 v1, 0x4

    .line 391
    invoke-direct {v0, v1}, Lj$/time/temporal/o;-><init>(I)V

    .line 391
    sput-object v0, Lj$/time/temporal/l;->d:Lj$/time/temporal/r;

    .line 409
    new-instance v0, Lj$/time/temporal/o;

    const/4 v1, 0x5

    .line 409
    invoke-direct {v0, v1}, Lj$/time/temporal/o;-><init>(I)V

    .line 409
    sput-object v0, Lj$/time/temporal/l;->e:Lj$/time/temporal/r;

    .line 425
    new-instance v0, Lj$/time/temporal/o;

    const/4 v1, 0x6

    .line 425
    invoke-direct {v0, v1}, Lj$/time/temporal/o;-><init>(I)V

    .line 425
    sput-object v0, Lj$/time/temporal/l;->f:Lj$/time/temporal/r;

    .line 443
    new-instance v0, Lj$/time/temporal/o;

    const/4 v1, 0x7

    .line 443
    invoke-direct {v0, v1}, Lj$/time/temporal/o;-><init>(I)V

    .line 443
    sput-object v0, Lj$/time/temporal/l;->g:Lj$/time/temporal/r;

    return-void
.end method

.method public static a(Lj$/time/temporal/TemporalAccessor;Lj$/time/temporal/q;)I
    .locals 5

    .line 218
    invoke-interface {p0, p1}, Lj$/time/temporal/TemporalAccessor;->t(Lj$/time/temporal/q;)Lj$/time/temporal/t;

    move-result-object v0

    .line 219
    invoke-virtual {v0}, Lj$/time/temporal/t;->h()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 222
    invoke-interface {p0, p1}, Lj$/time/temporal/TemporalAccessor;->w(Lj$/time/temporal/q;)J

    move-result-wide v1

    .line 223
    invoke-virtual {v0, v1, v2}, Lj$/time/temporal/t;->i(J)Z

    move-result p0

    if-eqz p0, :cond_0

    long-to-int p0, v1

    return p0

    .line 224
    :cond_0
    new-instance p0, Lj$/time/c;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Invalid value for "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " (valid values "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "): "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 88
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 224
    throw p0

    .line 220
    :cond_1
    new-instance p0, Lj$/time/temporal/s;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid field "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " for get() method, use getLong() instead"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 88
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 220
    throw p0
.end method

.method public static b(Lj$/time/temporal/Temporal;JLj$/time/temporal/TemporalUnit;)Lj$/time/temporal/Temporal;
    .locals 2

    const-wide/high16 v0, -0x8000000000000000L

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    const-wide p1, 0x7fffffffffffffffL

    .line 370
    invoke-interface {p0, p1, p2, p3}, Lj$/time/temporal/Temporal;->e(JLj$/time/temporal/TemporalUnit;)Lj$/time/temporal/Temporal;

    move-result-object p0

    const-wide/16 p1, 0x1

    :goto_0
    invoke-interface {p0, p1, p2, p3}, Lj$/time/temporal/Temporal;->e(JLj$/time/temporal/TemporalUnit;)Lj$/time/temporal/Temporal;

    move-result-object p0

    return-object p0

    :cond_0
    neg-long p1, p1

    goto :goto_0
.end method

.method public static c(Lj$/time/temporal/TemporalAccessor;Lj$/time/temporal/r;)Ljava/lang/Object;
    .locals 1

    .line 309
    sget-object v0, Lj$/time/temporal/l;->a:Lj$/time/temporal/r;

    if-eq p1, v0, :cond_1

    .line 310
    sget-object v0, Lj$/time/temporal/l;->b:Lj$/time/temporal/r;

    if-eq p1, v0, :cond_1

    .line 311
    sget-object v0, Lj$/time/temporal/l;->c:Lj$/time/temporal/r;

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 314
    :cond_0
    invoke-interface {p1, p0}, Lj$/time/temporal/r;->h(Lj$/time/temporal/TemporalAccessor;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static d(Lj$/time/temporal/TemporalAccessor;Lj$/time/temporal/q;)Lj$/time/temporal/t;
    .locals 1

    .line 170
    instance-of v0, p1, Lj$/time/temporal/a;

    if-eqz v0, :cond_1

    .line 171
    invoke-interface {p0, p1}, Lj$/time/temporal/TemporalAccessor;->g(Lj$/time/temporal/q;)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 172
    check-cast p1, Lj$/time/temporal/a;

    invoke-virtual {p1}, Lj$/time/temporal/a;->o()Lj$/time/temporal/t;

    move-result-object p0

    return-object p0

    .line 174
    :cond_0
    new-instance p0, Lj$/time/temporal/s;

    const-string v0, "Unsupported field: "

    .line 0
    invoke-static {v0, p1}, Lj$/time/d;->a(Ljava/lang/String;Lj$/time/temporal/q;)Ljava/lang/String;

    move-result-object p1

    .line 88
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 174
    throw p0

    .line 176
    :cond_1
    const-string v0, "field"

    invoke-static {p1, v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 177
    invoke-interface {p1, p0}, Lj$/time/temporal/q;->B(Lj$/time/temporal/TemporalAccessor;)Lj$/time/temporal/t;

    move-result-object p0

    return-object p0
.end method

.method public static e()Lj$/time/temporal/r;
    .locals 1

    .line 207
    sget-object v0, Lj$/time/temporal/l;->b:Lj$/time/temporal/r;

    return-object v0
.end method

.method public static f()Lj$/time/temporal/r;
    .locals 1

    .line 314
    sget-object v0, Lj$/time/temporal/l;->f:Lj$/time/temporal/r;

    return-object v0
.end method

.method public static g()Lj$/time/temporal/r;
    .locals 1

    .line 337
    sget-object v0, Lj$/time/temporal/l;->g:Lj$/time/temporal/r;

    return-object v0
.end method

.method public static h()Lj$/time/temporal/r;
    .locals 1

    .line 291
    sget-object v0, Lj$/time/temporal/l;->d:Lj$/time/temporal/r;

    return-object v0
.end method

.method public static i()Lj$/time/temporal/r;
    .locals 1

    .line 244
    sget-object v0, Lj$/time/temporal/l;->c:Lj$/time/temporal/r;

    return-object v0
.end method

.method public static j()Lj$/time/temporal/r;
    .locals 1

    .line 268
    sget-object v0, Lj$/time/temporal/l;->e:Lj$/time/temporal/r;

    return-object v0
.end method

.method public static k()Lj$/time/temporal/r;
    .locals 1

    .line 168
    sget-object v0, Lj$/time/temporal/l;->a:Lj$/time/temporal/r;

    return-object v0
.end method
