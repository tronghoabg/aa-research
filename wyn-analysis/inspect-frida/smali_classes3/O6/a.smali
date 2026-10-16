.class public final LO6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Landroid/content/pm/PackageInfo;

.field public final e:Ljava/lang/String;

.field public final f:LM6/d;


# direct methods
.method public constructor <init>(Landroid/content/Context;LH6/a;Landroid/content/pm/PackageInfo;Ljava/lang/String;LM6/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LO6/a;->a:Landroid/content/Context;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, LO6/a;->b:Ljava/lang/String;

    .line 11
    .line 12
    iget-object p1, p2, LH6/a;->a:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p1, p0, LO6/a;->c:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p3, p0, LO6/a;->d:Landroid/content/pm/PackageInfo;

    .line 17
    .line 18
    iput-object p4, p0, LO6/a;->e:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p5, p0, LO6/a;->f:LM6/d;

    .line 21
    .line 22
    return-void
.end method
