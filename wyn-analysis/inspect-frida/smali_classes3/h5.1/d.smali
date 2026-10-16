.class public final Lh5/d;
.super Lh5/a;
.source "SourceFile"


# instance fields
.field public final a:Luc/o;

.field public final b:Lcom/dexterous/flutterlocalnotifications/c;


# direct methods
.method public constructor <init>(Luc/o;Luc/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh5/d;->a:Luc/o;

    .line 5
    .line 6
    new-instance p1, Lcom/dexterous/flutterlocalnotifications/c;

    .line 7
    .line 8
    invoke-direct {p1, p2}, Lcom/dexterous/flutterlocalnotifications/c;-><init>(Luc/q;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lh5/d;->b:Lcom/dexterous/flutterlocalnotifications/c;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final H(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lh5/d;->a:Luc/o;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final t0()Lh5/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lh5/d;->b:Lcom/dexterous/flutterlocalnotifications/c;

    .line 2
    .line 3
    return-object v0
.end method
