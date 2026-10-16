.class public final LP6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lx6/b;

.field public final c:Lx6/g;

.field public final d:I


# direct methods
.method public synthetic constructor <init>(LQ1/n;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, LQ1/n;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ljava/lang/String;

    .line 7
    .line 8
    iput-object v0, p0, LP6/b;->a:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v0, p1, LQ1/n;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lx6/b;

    .line 13
    .line 14
    iput-object v0, p0, LP6/b;->b:Lx6/b;

    .line 15
    .line 16
    iget-object v0, p1, LQ1/n;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lx6/g;

    .line 19
    .line 20
    iput-object v0, p0, LP6/b;->c:Lx6/g;

    .line 21
    .line 22
    iget p1, p1, LQ1/n;->a:I

    .line 23
    .line 24
    iput p1, p0, LP6/b;->d:I

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final a()Lx6/b;
    .locals 1

    .line 1
    iget-object v0, p0, LP6/b;->b:Lx6/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lx6/b;->c:Lx6/b;

    .line 6
    .line 7
    :cond_0
    return-object v0
.end method
