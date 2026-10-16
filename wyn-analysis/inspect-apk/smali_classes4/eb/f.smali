.class public Leb/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqc/b;


# instance fields
.field public a:Luc/r;

.field public b:LDd/c;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final onAttachedToEngine(Lqc/a;)V
    .locals 3

    .line 1
    iget-object v0, p1, Lqc/a;->a:Landroid/content/Context;

    .line 2
    .line 3
    new-instance v1, LDd/c;

    .line 4
    .line 5
    iget-object v2, p1, Lqc/a;->c:Luc/f;

    .line 6
    .line 7
    invoke-direct {v1, v2, v0}, LDd/c;-><init>(Luc/f;Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    iput-object v1, p0, Leb/f;->b:LDd/c;

    .line 11
    .line 12
    new-instance v0, Luc/r;

    .line 13
    .line 14
    const-string v1, "com.ryanheise.just_audio.methods"

    .line 15
    .line 16
    invoke-direct {v0, v2, v1}, Luc/r;-><init>(Luc/f;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Leb/f;->a:Luc/r;

    .line 20
    .line 21
    iget-object v1, p0, Leb/f;->b:LDd/c;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Luc/r;->b(Luc/p;)V

    .line 24
    .line 25
    .line 26
    new-instance v0, Leb/e;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, p0, v1}, Leb/e;-><init>(Ljava/lang/Object;I)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p1, Lqc/a;->b:Llc/b;

    .line 33
    .line 34
    iget-object p1, p1, Llc/b;->t:Ljava/util/HashSet;

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final onDetachedFromEngine(Lqc/a;)V
    .locals 1

    .line 1
    iget-object p1, p0, Leb/f;->b:LDd/c;

    .line 2
    .line 3
    invoke-virtual {p1}, LDd/c;->B()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Leb/f;->b:LDd/c;

    .line 8
    .line 9
    iget-object v0, p0, Leb/f;->a:Luc/r;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Luc/r;->b(Luc/p;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
