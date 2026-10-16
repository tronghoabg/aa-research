.class public abstract Lx0/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lx0/q;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lx0/q;

    .line 2
    .line 3
    sget-object v1, Lx0/m;->p:Lx0/m;

    .line 4
    .line 5
    const-string v2, "TestTagsAsResourceId"

    .line 6
    .line 7
    invoke-direct {v0, v2, v1}, Lx0/q;-><init>(Ljava/lang/String;Ltf/p;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lx0/o;->a:Lx0/q;

    .line 11
    .line 12
    return-void
.end method
