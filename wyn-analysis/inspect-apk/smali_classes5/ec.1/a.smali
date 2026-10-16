.class public final synthetic Lec/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lic/a;
.implements Lic/b;


# instance fields
.field public final synthetic a:Lec/c;


# direct methods
.method public synthetic constructor <init>(Lec/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lec/a;->a:Lec/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lec/a;->a:Lec/c;

    .line 2
    .line 3
    iget-object v0, v0, Lec/c;->a:Landroid/content/Context;

    .line 4
    .line 5
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 6
    .line 7
    const-string v2, "IS_MAN_AUTO_START_ACCEPTED"

    .line 8
    .line 9
    invoke-static {v0, v2, v1}, Lvf/a;->J(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lec/a;->a:Lec/c;

    .line 2
    .line 3
    iget-object v0, v0, Lec/c;->a:Landroid/content/Context;

    .line 4
    .line 5
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 6
    .line 7
    const-string v2, "IS_MAN_AUTO_START_ACCEPTED"

    .line 8
    .line 9
    invoke-static {v0, v2, v1}, Lvf/a;->J(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
