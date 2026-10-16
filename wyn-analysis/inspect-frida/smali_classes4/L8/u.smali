.class public final LL8/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/c;


# instance fields
.field public final a:Ljava/util/Set;

.field public final b:Ll9/c;


# direct methods
.method public constructor <init>(Ljava/util/Set;Ll9/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LL8/u;->a:Ljava/util/Set;

    .line 5
    .line 6
    iput-object p2, p0, LL8/u;->b:Ll9/c;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)V
    .locals 3

    .line 1
    iget-object v0, p0, LL8/u;->a:Ljava/util/Set;

    .line 2
    .line 3
    const-class v1, Ls8/b;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, LL8/u;->b:Ll9/c;

    .line 12
    .line 13
    invoke-interface {v0, p1}, Ll9/c;->a(Ll9/a;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    new-instance v0, LE5/Q;

    .line 18
    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v2, "Attempting to publish an undeclared event "

    .line 22
    .line 23
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string p1, "."

    .line 30
    .line 31
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const/4 v1, 0x3

    .line 39
    invoke-direct {v0, p1, v1}, LE5/Q;-><init>(Ljava/lang/String;I)V

    .line 40
    .line 41
    .line 42
    throw v0
.end method
