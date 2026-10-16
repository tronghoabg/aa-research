.class public final LEf/M0;
.super LJf/q;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final e:J


# direct methods
.method public constructor <init>(JLlf/c;)V
    .locals 1

    .line 1
    invoke-interface {p3}, Ljf/c;->getContext()Ljf/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, p3, v0}, LJf/q;-><init>(Ljf/c;Ljf/h;)V

    .line 6
    .line 7
    .line 8
    iput-wide p1, p0, LEf/M0;->e:J

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final M()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, LEf/z0;->M()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "(timeMillis="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-wide v1, p0, LEf/M0;->e:J

    .line 19
    .line 20
    const/16 v3, 0x29

    .line 21
    .line 22
    invoke-static {v0, v1, v2, v3}, LA/f;->e(Ljava/lang/StringBuilder;JC)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    return-object v0
.end method

.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, LEf/a;->c:Ljf/h;

    .line 2
    .line 3
    invoke-static {v0}, LEf/H;->s(Ljf/h;)LEf/M;

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v1, "Timed out waiting for "

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-wide v1, p0, LEf/M0;->e:J

    .line 14
    .line 15
    const-string v3, " ms"

    .line 16
    .line 17
    invoke-static {v0, v1, v2, v3}, LVa/M6;->s(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, LEf/L0;

    .line 22
    .line 23
    invoke-direct {v1, v0, p0}, LEf/L0;-><init>(Ljava/lang/String;LEf/M0;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v1}, LEf/z0;->q(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    return-void
.end method
