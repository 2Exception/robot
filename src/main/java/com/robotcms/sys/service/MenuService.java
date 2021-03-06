package com.robotcms.sys.service;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.IService;
import com.robotcms.common.domain.Tree;
import com.robotcms.sys.domain.MenuDO;

/**
 * <pre>
 * </pre>
 * |
 */
@Service
public interface MenuService extends IService<MenuDO> {
    Tree<MenuDO> getSysMenuTree(Long id);

    List<Tree<MenuDO>> listMenuTree(Long id);

    Tree<MenuDO> getTree();

    Tree<MenuDO> getTree(Long id);

    Set<String> listPerms(Long userId);
}
