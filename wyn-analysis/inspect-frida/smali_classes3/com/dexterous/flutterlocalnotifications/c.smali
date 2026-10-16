.class public final Lcom/dexterous/flutterlocalnotifications/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/dexterous/flutterlocalnotifications/i;
.implements Lh5/e;


# instance fields
.field public final a:Luc/q;


# direct methods
.method public synthetic constructor <init>(Luc/q;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/dexterous/flutterlocalnotifications/c;->a:Luc/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public B(Z)V
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lcom/dexterous/flutterlocalnotifications/c;->a:Luc/q;

    .line 6
    .line 7
    invoke-interface {v0, p1}, Luc/q;->a(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public a(Ljava/util/HashMap;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/dexterous/flutterlocalnotifications/c;->a:Luc/q;

    .line 2
    .line 3
    const-string v1, "sqlite_error"

    .line 4
    .line 5
    invoke-interface {v0, v1, p2, p1}, Luc/q;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public b(Ljava/io/Serializable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/dexterous/flutterlocalnotifications/c;->a:Luc/q;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Luc/q;->a(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public s()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lcom/dexterous/flutterlocalnotifications/c;->a:Luc/q;

    .line 3
    .line 4
    const-string v2, "permissionRequestInProgress"

    .line 5
    .line 6
    const-string v3, "Another permission request is already in progress"

    .line 7
    .line 8
    invoke-interface {v1, v2, v3, v0}, Luc/q;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
