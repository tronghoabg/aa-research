.class public final LA/L;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LA/c0;

.field public final b:LS3/e;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final e:LA/n;

.field public final f:LA/n;

.field public final g:LA/n;

.field public final h:J

.field public final i:LA/n;


# direct methods
.method public constructor <init>(LA/i;LS3/e;Ljava/lang/Object;Ljava/lang/Object;LA/n;)V
    .locals 3

    .line 1
    const-string v0, "animationSpec"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "typeConverter"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1, p2}, LA/i;->q(LS3/e;)LA/c0;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, LA/L;->a:LA/c0;

    .line 19
    .line 20
    iput-object p2, p0, LA/L;->b:LS3/e;

    .line 21
    .line 22
    iput-object p3, p0, LA/L;->c:Ljava/lang/Object;

    .line 23
    .line 24
    iput-object p4, p0, LA/L;->d:Ljava/lang/Object;

    .line 25
    .line 26
    iget-object p2, p2, LS3/e;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p2, Lkotlin/jvm/internal/n;

    .line 29
    .line 30
    invoke-interface {p2, p3}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, LA/n;

    .line 35
    .line 36
    iput-object v0, p0, LA/L;->e:LA/n;

    .line 37
    .line 38
    invoke-interface {p2, p4}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p4

    .line 42
    check-cast p4, LA/n;

    .line 43
    .line 44
    iput-object p4, p0, LA/L;->f:LA/n;

    .line 45
    .line 46
    if-eqz p5, :cond_0

    .line 47
    .line 48
    invoke-static {p5}, LA/t;->c(LA/n;)LA/n;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    invoke-interface {p2, p3}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    check-cast p2, LA/n;

    .line 58
    .line 59
    const-string p3, "<this>"

    .line 60
    .line 61
    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p2}, LA/n;->c()LA/n;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    :goto_0
    iput-object p2, p0, LA/L;->g:LA/n;

    .line 69
    .line 70
    invoke-interface {p1, v0, p4, p2}, LA/c0;->i(LA/n;LA/n;LA/n;)J

    .line 71
    .line 72
    .line 73
    move-result-wide v1

    .line 74
    iput-wide v1, p0, LA/L;->h:J

    .line 75
    .line 76
    invoke-interface {p1, v0, p4, p2}, LA/c0;->n(LA/n;LA/n;LA/n;)LA/n;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    iput-object p1, p0, LA/L;->i:LA/n;

    .line 81
    .line 82
    return-void
.end method


# virtual methods
.method public final a(J)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-wide v0, p0, LA/L;->h:J

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, LA/L;->d:Ljava/lang/Object;

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    iget-object v0, p0, LA/L;->b:LS3/e;

    .line 11
    .line 12
    iget-object v0, v0, LS3/e;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lkotlin/jvm/internal/n;

    .line 15
    .line 16
    iget-object v1, p0, LA/L;->a:LA/c0;

    .line 17
    .line 18
    iget-object v4, p0, LA/L;->e:LA/n;

    .line 19
    .line 20
    iget-object v5, p0, LA/L;->f:LA/n;

    .line 21
    .line 22
    iget-object v6, p0, LA/L;->g:LA/n;

    .line 23
    .line 24
    move-wide v2, p1

    .line 25
    invoke-interface/range {v1 .. v6}, LA/c0;->h(JLA/n;LA/n;LA/n;)LA/n;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-interface {v0, p1}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
.end method

.method public final b(J)LA/n;
    .locals 6

    .line 1
    iget-wide v0, p0, LA/L;->h:J

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, LA/L;->i:LA/n;

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    iget-object v0, p0, LA/L;->a:LA/c0;

    .line 11
    .line 12
    iget-object v3, p0, LA/L;->e:LA/n;

    .line 13
    .line 14
    iget-object v4, p0, LA/L;->f:LA/n;

    .line 15
    .line 16
    iget-object v5, p0, LA/L;->g:LA/n;

    .line 17
    .line 18
    move-wide v1, p1

    .line 19
    invoke-interface/range {v0 .. v5}, LA/c0;->f(JLA/n;LA/n;LA/n;)LA/n;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "TargetBasedAnimation: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, LA/L;->c:Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, " -> "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, LA/L;->d:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ",initial velocity: "

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, LA/L;->g:LA/n;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", duration: "

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-wide/32 v1, 0xf4240

    .line 39
    .line 40
    .line 41
    iget-wide v3, p0, LA/L;->h:J

    .line 42
    .line 43
    div-long/2addr v3, v1

    .line 44
    const-string v1, " ms"

    .line 45
    .line 46
    invoke-static {v0, v3, v4, v1}, LVa/M6;->s(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    return-object v0
.end method
